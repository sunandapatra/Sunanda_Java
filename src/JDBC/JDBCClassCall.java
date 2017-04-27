package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCClassCall {
	
	public static void main(String[] args) {
		JDBCClassCall prog = new JDBCClassCall();
		try {
			prog.makeDBCalls();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void makeDBCalls() throws Exception{
		String firstName = "Sunanda";
		String lastName = "Patra";
		ResultSet rs = null;
		PreparedStatement psmt = null;
		Connection con = null;
		
		JDBCConnection connection = new JDBCConnection();
		connection.makeDBCalls();
		try {
			psmt = con.prepareStatement("select * from customer where Customer_Fname = ? and Customer_Lname = ?");
			psmt.setString(1, firstName);
			psmt.setString(2, lastName);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString(2) +" " + rs.getString("Customer_Lname"));
				
				//list.add(new Employee(firstname, lastname))
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			if(psmt != null) {
				try {
					psmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
}
	}
}