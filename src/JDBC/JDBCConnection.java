package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {

	public void makeDBCalls() throws Exception {
		String url = "jdbc:mysql://localhost:3306/sunandapatra";
		String username = "sunandapatra";
		String password = "sonusona14";
		Connection con = null;

		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url, username, password);
		
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}