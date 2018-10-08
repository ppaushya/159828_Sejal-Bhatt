package org.capg.dao;

import java.util.List;

import java.util.Map;
import org.capg.model.Account;
import org.capg.model.Transaction;

public interface ITransactionDao {

	public List<Transaction> getAllTransactions(Account account);
	public void createTransaction(Account account, Transaction transaction);
	
}
