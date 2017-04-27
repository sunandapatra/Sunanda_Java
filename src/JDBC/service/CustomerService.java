package JDBC.service;

import java.util.List;
import JDBC.domain.Customer;


public interface CustomerService {
	List<Customer> getCustomers();
}