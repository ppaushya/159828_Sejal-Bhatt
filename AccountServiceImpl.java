package org.capg.service;

import java.util.Set;

import org.capg.dao.AccountDaoImpl;

import org.capg.dao.IAccountDao;
import org.capg.model.Account;
import org.capg.model.Customer;


public class AccountServiceImpl implements IAccountService {

	private IAccountDao accountDao= new AccountDaoImpl();

	public void createAccount(Account account) {
		// TODO Auto-generated method stub
		
		accountDao.createAccount(account);
		
	}

	public Set<Account> getAccountsForCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return accountDao.getAccountsOfCustomer(customer);
	}
	
	
	
}
