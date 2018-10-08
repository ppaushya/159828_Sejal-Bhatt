package org.capg.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.capg.model.Account;
import org.capg.model.Address;
import org.capg.model.Customer;

public class AccountDaoImpl implements IAccountDao	{
	
	
	Set<Account> accounts = dummyAccounts();
	private static Set<Account> dummyAccounts()	{
		
		Set<Account> accounts=new HashSet<>();
		
		return accounts;
	}
	
	@Override
	public Set<Account> getAccountsOfCustomer(Customer customer)
	{
		return accounts;
	}
	
	@Override
	public void createAccount(Account account)
	{
		accounts.add(account);
	}

}
