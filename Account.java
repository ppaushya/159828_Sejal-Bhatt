package org.capg.model;
import java.time.LocalDate;
import java.util.Map;

public class Account {
	
	private long accountNo;
	private AccountType accountType;
	private LocalDate openingDate;
	private double openingBalance;
	private String description;
	
	
	public Account(long accountNo, AccountType accountType, LocalDate openingDate, double openingBalance,
			String description) {
		super();
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.openingDate = openingDate;
		this.openingBalance = openingBalance;
		this.description = description;
	}
	
	public Account() {}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountType=" + accountType + ", openingDate=" + openingDate
				+ ", openingBalance=" + openingBalance + ", description=" + description + "]";
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public LocalDate getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(LocalDate openingDate) {
		this.openingDate = openingDate;
	}

	public double getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(double openingBalance) {
		this.openingBalance = openingBalance;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
