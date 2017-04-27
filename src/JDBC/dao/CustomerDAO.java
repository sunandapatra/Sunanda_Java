package JDBC.dao;

import java.util.List;
import JDBC.domain.Customer;

public interface CustomerDAO {
	List<Customer> getCustomers();
}