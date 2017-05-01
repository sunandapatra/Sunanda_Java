package JDBC.dao.Impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import JDBC.dao.ICustomerDAO;
import JDBC.domain.Customer;

public class CustomerDAOImpl implements ICustomerDAO {

	String url = "jdbc:mysql://localhost:3306/sunandapatra";
	String username = "sunandapatra";
	String password = "sonusona14";
	String firstName = "Sunanda";
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	PreparedStatement psmt = null;

	public List<Customer> getCustomers() {
		List<Customer> customer = new ArrayList<Customer>();
		Customer cust = new Customer(1, "Sunanda", "Patra", "USA", 45);
		//Customer cust = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);

			/*
			 * psmt =
			 * con.prepareStatement("select * from customer where Customer_Id ="
			 * + cust.getCustomerId() + " and Customer_Fname = '" +
			 * cust.getFirstName() + "' " + "and Customer_Lname ='" +
			 * cust.getLastName() + "' and Customer_Address = '" +
			 * cust.getAddress() + "' and Customer_Phone= " + cust.getPhone() +
			 * "");
			 */

			psmt = con.prepareStatement("select * from customer where Customer_Fname= '"+firstName+"' ");
			rs = psmt.executeQuery();
			while (rs.next()) {
				cust = new Customer();
				cust.setCustomerId(rs.getInt("Customer_Id"));
				cust.setFirstName(rs.getString(2));
				cust.setLastName(rs.getString("Customer_Lname"));
				cust.setAddress(rs.getString("Customer_Address"));
				cust.setPhone(rs.getInt("Customer_Phone"));
				customer.add(cust);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return customer;
	}

}