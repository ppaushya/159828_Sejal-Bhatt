package org.capg.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.capg.model.Account;
import org.capg.model.Transaction;

public class TransactionDaoImpl implements ITransactionDao {
	
	   Map<Account, List<Transaction>> transactions = dummyTransactions();
	private static Map<Account, List<Transaction>> dummyTransactions()	{
		
		Map<Account, List<Transaction>> transactions=new HashMap<Account, List<Transaction>>();
		
		return transactions;
	}
	@Override
	public List<Transaction> getAllTransactions(Account account) {
		// TODO Auto-generated method stub
		return transactions.get(account);
	}
	@Override
	public void createTransaction(Account account, Transaction transaction) {
		// TODO Auto-generated method stub
                List lst=transactions.get(account);
                lst.add(transaction);
		transactions.put(account,lst);
	}
	
	

}
