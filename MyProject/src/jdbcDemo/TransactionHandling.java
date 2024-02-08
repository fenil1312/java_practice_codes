package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionHandling {

	private static final String url = "jdbc:mysql://127.0.0.1:3306/mydb";
	private static final String username = "root";
	private static final String password = "root";

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection conn = null;
		PreparedStatement withdrawState = null;
		PreparedStatement depositState = null;

		try {
			conn = DriverManager.getConnection(url, username, password);
			String withdrawQuery = "UPDATE accounts SET balance = balance - ? WHERE account_number = ?";
			String depositQuery = "UPDATE accounts SET balance = balance + ? WHERE account_number = ?";

			conn.setAutoCommit(false);

			withdrawState = conn.prepareStatement(withdrawQuery);
			depositState = conn.prepareStatement(depositQuery);

			withdrawState.setDouble(1, 500.00);
			withdrawState.setString(2, "account123");
			depositState.setDouble(1, 500.00);
			depositState.setString(2, "account456");

			int withdrawRows = withdrawState.executeUpdate();
			int depositRows = depositState.executeUpdate();

			if (withdrawRows > 0 && depositRows > 0) {
				conn.commit();
				System.out.println("Transaction Successful...");
			} else {
				conn.rollback();
				System.out.println("Transaction Failed!!!");
			}

		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			try {
				conn.close();
				withdrawState.close();
				depositState.close();
			}

			catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
