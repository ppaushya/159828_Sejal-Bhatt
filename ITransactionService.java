package org.capg.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.capg.model.Account;
import org.capg.model.Transaction;

public interface ITransactionService {

public void createTransaction(Account account,Transaction transaction);
	
	public List<Transaction> getAllTransactions(Account account);
	
}
