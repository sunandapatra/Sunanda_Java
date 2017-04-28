package JDBC.service;

import java.util.List;

import Domain.Employee;
import JDBC.dao.CustomerDAO;
import JDBC.dao.CustomerDAOImplementation;
import JDBC.domain.Customer;

public class CustomerServiceImplementation implements CustomerService {

	public List<Customer> getCustomers() {
		CustomerDAO custDao = new CustomerDAOImplementation();
		List<Customer> customers = custDao.getCustomers();
		for (Customer cust : customers) {
			if(cust.getAddress().equals("USA")){
				cust.setAddress("INDIA");
			}
		}
		return customers;
	}

}