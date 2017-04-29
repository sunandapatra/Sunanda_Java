package JDBC.service.Impl;

import java.util.List;

import Domain.Employee;
import JDBC.dao.ICustomerDAO;
import JDBC.dao.Impl.CustomerDAOImpl;
import JDBC.domain.Customer;
import JDBC.service.ICustomerService;

public class CustomerServiceImpl implements ICustomerService {

	public List<Customer> getCustomers() {
		ICustomerDAO custDao = new CustomerDAOImpl();
		List<Customer> customers = custDao.getCustomers();
		for (Customer cust : customers) {
			if(cust.getAddress().equals("USA")){
				cust.setAddress("INDIA");
			}
		}
		return customers;
	}

}