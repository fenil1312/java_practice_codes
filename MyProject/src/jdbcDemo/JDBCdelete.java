package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCdelete {

	private static final String url = "jdbc:mysql://127.0.0.1:3306/xyz";
	private static final String username = "root";
	private static final String password = "root";

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement delete = null;
		int id = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Provide Employee Id To Remove Their Data : ");
		System.out.print("Enter Id : ");
		id = sc.nextInt();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(url, username, password);
			String query = "DELETE FROM employee_info WHERE id = '" + id + "'";
			delete = conn.prepareStatement(query);
			delete.executeUpdate();
			System.out.println("Data Removed Successfully...");

		}

		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			try {
				conn.close();
				delete.close();
			}

			catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
