package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ImageHandling {

	private static final String url = "jdbc:mysql://127.0.0.1:3306/mydb";
	private static final String username = "root";
	private static final String password = "root";

	public static void main(String[] args) throws IOException {

		Connection conn = null;
		PreparedStatement preState = null;
		ResultSet resultSet = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			conn = DriverManager.getConnection(url, username, password);
//			String image_path = "C:\\Users\\fenil\\OneDrive\\Desktop\\img\\MPP_3909.jpg";
//			String insertQuery = "INSERT INTO image(image_data) VALUES (?)";
//
//			FileInputStream fis = new FileInputStream(image_path);
//			byte[] imageData = new byte[fis.available()];
//			fis.read(imageData);
//			preState = conn.prepareStatement(insertQuery);
//			preState.setBytes(1, imageData);
//			int affectedRows = preState.executeUpdate();
//
//			if (affectedRows > 0) {
//				System.out.println("Image Inserted In DataBase Successfully...");
//			} else {
//				System.out.println("Image Not Inserted...");
//			}

			String folder_path = "C:\\Users\\fenil\\OneDrive\\Desktop\\receive_img\\";
			String selectQuery = "SELECT image_data FROM image";
			preState = conn.prepareStatement(selectQuery);
			resultSet = preState.executeQuery();

			if (resultSet.next()) {
				byte[] image_data = resultSet.getBytes("image_data");
				String image_path = folder_path + "new.jpg";
				FileOutputStream fos = new FileOutputStream(image_path);
				fos.write(image_data);
				System.out.println("Image Inserted In Folder Successfully...");
			} 
			
			else {
				System.out.println("Image not found.");
			}

		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		finally {
			try {
				conn.close();
				preState.close();
				resultSet.close();
			}

			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
