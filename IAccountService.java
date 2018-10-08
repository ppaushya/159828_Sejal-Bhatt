package org.capg.service;

import java.util.List;
import java.util.Set;

import org.capg.model.Account;
import org.capg.model.Customer;

public interface IAccountService {

	public void createAccount(Account account);
	
	public Set<Account> getAccountsForCustomer(Customer customer);
	
	
}
