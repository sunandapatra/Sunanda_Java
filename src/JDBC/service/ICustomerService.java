package JDBC.service;

import java.util.List;
import JDBC.domain.Customer;


public interface ICustomerService {
	List<Customer> getCustomers();
}