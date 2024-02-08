package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCread {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xyz", "root", "root");

			st = conn.createStatement();
			rs = st.executeQuery("SELECT * FROM employee_info");
			System.out.println("   -------------------------------------");
			System.out.println("      " + "ID" + "        " + "NAME" + "           " + "SALARY");
			System.out.println("   -------------------------------------");
			while (rs.next()) {
				System.out.println("       " + rs.getInt("id") + "        " + rs.getString("name") + "          " + rs.getInt("salary"));
			}
			System.out.println("   -------------------------------------");
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			try {
				st.close();
				rs.close();
				conn.close();
			}

			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
