package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCconnection {

	private static final String url = "jdbc:mysql://127.0.0.1:3306/xyz";
	private static final String username = "root";
	private static final String password = "root";
	{

		Connection conn = null;
		PreparedStatement ps = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(url, username, password);

			String query = "";
			ps = conn.prepareStatement(query);

			ps.execute();
			ps.executeUpdate();
			ps.executeQuery();

			st = conn.createStatement();

			st.execute(query);
			st.executeUpdate(query);

			rs = st.executeQuery(query);
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
				ps.close();
				st.close();
				rs.close();
			}

			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
