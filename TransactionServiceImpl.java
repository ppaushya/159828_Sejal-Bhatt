package org.capg.service;

import java.util.List;

import java.util.Map;
import org.capg.dao.ITransactionDao;
import org.capg.dao.TransactionDaoImpl;
import org.capg.model.Account;
import org.capg.model.Transaction;

public class TransactionServiceImpl implements ITransactionService {

	
	private ITransactionDao transDao=new TransactionDaoImpl();
	
	@Override
	public void createTransaction(Account account,Transaction transaction) {
		// TODO Auto-generated method stub
		transDao.createTransaction(account,transaction);
	}

	@Override
	public List<Transaction> getAllTransactions(Account account) {
		// TODO Auto-generated method stub
		return transDao.getAllTransactions(account);
	}

	
	
}
