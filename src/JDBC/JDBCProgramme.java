package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class JDBCProgramme {
	
	static {
		try {
//			Driver driver = new com.mysql.jdbc.Driver();
//			DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		JDBCProgramme prog = new JDBCProgramme();
		List<Employees> employees = prog.getEmployees("Parto");
		
		for(Employees emp : employees){
			System.out.println(emp.getFirstName());
		}

	}
	
	public void makeDBCalls(){
		String url = "jdbc:mysql://localhost:3306/sunandapatra";
		String username = "sunandapatra";
		String password = "sonusona14";
		String firstName = "Sunanda";
		String lastName = "Patra";
		
//		String oracleDriver = "oracle.jdbc.driver.OracleDriver";
//	    String connectionURL = "jdbc:oracle:thin:@localhost:1521/XE";
	    
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement psmt;
		
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			
//			stmt = con.createStatement();
//			rs = stmt.executeQuery("SELECT * FROM employees where first_name = '"+firstName+"' and last_name = '"+lastName+"'");
			
			
			
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
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public List<Employees> getEmployees(String firstName){
		List<Employees> employees = new ArrayList<>();
		
		return employees;
	}

}

class Employees{
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}