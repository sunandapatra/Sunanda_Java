package JDBC;

import java.util.List;

import Domain.Employee;
import JDBC.dao.ICustomerDAO;
import JDBC.dao.Impl.CustomerDAOImpl;
import JDBC.domain.Customer;
import JDBC.service.ICustomerService;
import JDBC.service.Impl.CustomerServiceImpl;

public class Client {

	public static void main(String[] args) {

		ICustomerDAO prog = new CustomerDAOImpl();
		List<Customer> customers = prog.getCustomers();
		
		ICustomerService service = new CustomerServiceImpl();
		List<Customer> customers1 = service.getCustomers();

		for (Customer cust : customers1) {
			System.out.println(cust.toString());
		}
	}

}
