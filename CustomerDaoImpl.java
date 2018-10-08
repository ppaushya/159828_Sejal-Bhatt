package org.capg.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.capg.model.Account;
import org.capg.model.Address;
import org.capg.model.Customer;


public class CustomerDaoImpl implements ICustomerDao {
	
	private List<Customer> customers=dummyDB();
	
	private static List<Customer> dummyDB()	{
		
		List<Customer> customers=new ArrayList<>();
		
		Address address1=new Address("North Street","first avenue","Chennai","TN",603002);
		customers.add(new Customer(101, "Tom","Riley",address1,"tomr@gmail.com","9898013524",LocalDate.of(1985, 12, 3)));
		
		Address address2=new Address("South Street","Eighth avenue","Hyderabad","AP",611524);
		customers.add(new Customer(102, "Sejal","Bhatt",address2,"sejal@gmail.com","9887513524",LocalDate.of(1996, 10, 23)));
		
		return customers;
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customers;
	}

	@Override
	public void createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
		customers.add(customer);
	}
	
	

}
