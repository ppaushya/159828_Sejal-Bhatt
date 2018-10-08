package org.capg.service;

import java.time.LocalDate;
import java.util.List;

import org.capg.dao.CustomerDaoImpl;
import org.capg.dao.ICustomerDao;
import org.capg.model.Customer;

public class CustomerServiceImpl implements ICustomerService{

	
	private ICustomerDao customerdao= new CustomerDaoImpl();
	
	
	
	
	@Override
	public void createCustomer(Customer customer) {
		// TODO Auto-generated method stub
	
		if(isValidCustomer(customer)) 
		{
		customerdao.createCustomer(customer);
	}
	}


	private boolean isValidCustomer(Customer customer) {
		boolean flag=false;
		
		
			if(customer.getMobile().matches("(7|8|9)\\d{9}"))
				flag=true;
			else
				flag=false;
		
		return flag;
	}
	
	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerdao.getAllCustomers();
	}

	
	
	
}
