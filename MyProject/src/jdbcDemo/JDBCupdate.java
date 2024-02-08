package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCupdate {

	private static final String url = "jdbc:mysql://127.0.0.1:3306/xyz";
	private static final String username = "root";
	private static final String password = "root";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Modify Employee Data : ");
		System.out.println("1. Name");
		System.out.println("2. Salary");
		System.out.print("Select any above option : ");
		int option = sc.nextInt();

		int id;
		String name = null;
		int salary = 0;

		Connection conn = null;
		PreparedStatement update = null;
		String query = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, password);

			if (option == 1) {
				System.out.print("Enter Id : ");
				id = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter New Name : ");
				name = sc.nextLine();
				query = "UPDATE employee_info SET name = '" + name + "' WHERE id = '" + id + "' ";
			}

			else if (option == 2) {
				System.out.print("Enter Id : ");
				id = sc.nextInt();
				System.out.print("Enter New Salary : ");
				salary = sc.nextInt();
				query = "UPDATE employee_info SET salary = '" + salary + "' WHERE id = '" + id + "' ";
			}

			update = conn.prepareStatement(query);
			int updatedRow = update.executeUpdate();
			if (updatedRow > 0) {
				System.out.println("Data Updated Successfully...");
			} else {
				System.out.println("Data Not Updated...");
			}
		}

		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			try {
				conn.close();
				update.close();
			}

			catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
