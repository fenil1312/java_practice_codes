package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InsertImage {

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
		PreparedStatement preState = null;

		try {
			conn = DriverManager.getConnection(url, username, password);
			String query = "INSERT INTO image(image_data) VALUES (?)";
			String image_path = "C:\\Users\\fenil\\OneDrive\\Pictures\\my pic 2.jpg";

			FileInputStream fis = new FileInputStream(image_path);
			byte[] image_data = new byte[fis.available()];
			fis.read(image_data);
			preState = conn.prepareStatement(query);
			preState.setBytes(1, image_data);
			int affectedRows = preState.executeUpdate();

			if (affectedRows > 0) {
				System.out.println("Image Inserted In DataBase!");
			} else {
				System.out.println("Image Not Found.");
			}
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			try {
				conn.close();
				preState.close();
			}

			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
