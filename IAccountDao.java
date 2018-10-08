package org.capg.dao;

import java.util.Set;

import org.capg.model.Account;
import org.capg.model.Customer;

public interface IAccountDao {
	
	public Set<Account> getAccountsOfCustomer(Customer customer);
	public void createAccount(Account account);
	

}
