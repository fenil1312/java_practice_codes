package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SelectImage {

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
		ResultSet resultSet = null;

		try {
			conn = DriverManager.getConnection(url, username, password);
			String query = "SELECT * FROM image WHERE image_id = (?)";
			String folder_path = "C:\\Users\\fenil\\OneDrive\\Desktop\\img\\";

			preState = conn.prepareStatement(query);
			preState.setInt(1, 1);
			resultSet = preState.executeQuery();

			if (resultSet.next()) {
//				int id = resultSet.getInt("image_id");
				byte[] image_data = resultSet.getBytes("image_data");
//				Timestamp dateTime = resultSet.getTimestamp("uplode_date");
				String image_path = folder_path + "mypic1.jpg";
				FileOutputStream fos = new FileOutputStream(image_path);
				fos.write(image_data);
				System.out.println("Image Inserted In Folder Successfully...");
			} else {
				System.out.println("Image Not Found!");
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
				resultSet.close();
			}

			catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
