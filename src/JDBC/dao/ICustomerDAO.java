package JDBC.dao;

import java.util.List;
import JDBC.domain.Customer;

public interface ICustomerDAO {
	List<Customer> getCustomers();
}