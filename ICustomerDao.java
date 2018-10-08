package org.capg.dao;
import java.util.List;

import org.capg.model.*;

public interface ICustomerDao {
	
	public List<Customer> getAllCustomers();
	public void createCustomer(Customer customer);

}
