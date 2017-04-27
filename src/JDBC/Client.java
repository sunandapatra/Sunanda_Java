package JDBC;

import java.util.List;
import JDBC.dao.CustomerDAO;
import JDBC.dao.CustomerDAOImplementation;
import JDBC.domain.Customer;
import JDBC.service.CustomerService;
import JDBC.service.CustomerServiceImplementation;

public class Client {

	public static void main(String[] args) {

		CustomerDAO prog = new CustomerDAOImplementation();
		List<Customer> customers = prog.getCustomers();
		System.out.println("Customers: " + customers);

		for (Customer cust : customers) {
			System.out.println(cust.getFirstName());
		}
	}

}
