package org.capg.service;

import java.util.List;

import org.capg.model.Customer;


public interface ICustomerService {

public void createCustomer(Customer customer);
	
	public List<Customer> getAllCustomers();
	
	
}
