package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;
import java.util.Scanner;

public class JDBCcreate {

	private static final String url = "jdbc:mysql://127.0.0.1:3306/xyz";
	private static final String username = "root";
	private static final String password = "root";

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement ps = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Information : ");
		System.out.print("Enter Name: ");
		String name = sc.nextLine();
		System.out.print("Enter Salary : ");
		int salary = sc.nextInt();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(url, username, password);
//			System.out.println("connected");

			String query = "INSERT INTO employee_info(name,salary) VALUES (?,?)";
//			String query = "INSERT INTO employee_info(name,salary) VALUES ('" + name + "','" + salary + "')";
			ps = conn.prepareStatement(query);
			ps.setString(1, name);
			ps.setInt(2, salary);
			ps.executeUpdate();
			System.out.println("Data Inserted Successfully");
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			try {
				ps.close();
				conn.close();
			}

			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
