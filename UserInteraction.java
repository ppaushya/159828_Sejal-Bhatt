package org.capg.view;
import org.capg.model.*;
import org.capg.util.Utility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import org.capg.service.TransactionServiceImpl;

public class UserInteraction {
	
	Scanner sc=new Scanner(System.in);
	Set<Account> accounts=new HashSet<>();
	
	public Customer getCustomerDetails()	{
		Customer customer=new Customer();
		
		customer.setCustomerId(Utility.generateNumber());
		customer.setFirstName(promptFirstName());
		customer.setLastName(promptLastName());
		customer.setAddress(promptAddress());
		customer.setEmailId(promptEmailId());
		customer.setMobile(promptMobile());
		customer.setDateOfBirth(promptDateOfBirth());
		return customer;
		
	}
	
	
	
	//----------------Customer Validations----------------
	
	public String promptFirstName()	{
			String fname;
			System.out.print("Enter first");
			fname= Utility.isValidName();
			return fname;
	}
	
	public String promptLastName()	{
		String lname;
		System.out.print("Enter last");
		lname= Utility.isValidName();
		return lname;
	}
	
	public Address promptAddress()
	{
		String line1,line2,city,state;
		long pin;
		Address addr=new Address();
		System.out.println("Enter address line 1:");
		line1=sc.next();
		addr.setAddressLine1(line1);
		System.out.println("Enter address line 2:");
		line2=sc.next();
		addr.setAddressLine2(line2);
		System.out.println("Enter city:");
		city=sc.next();
		addr.setCity(city);
		System.out.println("Enter state:");
		state=sc.next();
		addr.setState(state);
		boolean flag=false;
		do	{
	
			System.out.println("Enter pincode:");
			pin=sc.nextLong();
			flag=Long.toString(pin).matches("[0-9]{6}");
			if(flag==false)
			{
				System.out.println("Enter valid 6 digit pincode!");
			}
			
		}while(flag==false);
		
		addr.setPinCode(pin);
		return addr;
	}
	
	public String promptEmailId()	{
		String email;
		
		boolean flag=false;
		do	{
	
			System.out.println("Enter email id:");
			email=sc.next();
			flag=email.matches("[a-z0-9.]{3,}@gmail.com");
			if(flag==false)
			{
				System.out.println("Enter valid email!");
			}
			
		}while(flag==false);
		
		return email;
	}
	
	public String promptMobile()	{
		String mobile;
		
		boolean flag=false;
		do	{
	
			System.out.println("Enter mobile number:");
			mobile=sc.next();
			flag=mobile.matches("[0-9]{10}");
			if(flag==false)
			{
				System.out.println("Enter valid 10 digit mobile number!");
			}
			
		}while(flag==false);
		
		return mobile;
	}
	
	public LocalDate promptDateOfBirth()	{
		
		LocalDate date;
		String dob;
		
		boolean flag=false;
		do	{
	
			System.out.println("Enter date of birth in format DD/MM/YYYY:");
			dob=sc.next();
				flag=dob.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}");
			if(flag==false)
			{
				System.out.println("Enter valid date!");
			}
		}while(flag==false);
		
		
		
		date=LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		return date;
		
	}
	//------------------------------------------
	

	public void printCustomers(List<Customer> customers)
	{
		System.out.println("CustomerID\tCustomerName\t"
				+ "EmailID\tMobileNo\tDateOfBirth\tAddress");
		System.out.println("-----------------------------------------------------------------");
		
		for(Customer customer:customers)
		{
			System.out.println(customer.getCustomerId()+"\t"+customer.getFirstName()+" "+
		customer.getLastName()+"\t"+customer.getEmailId()+"\t"+customer.getMobile()+"\t"+
					customer.getDateOfBirth()+"\t"+customer.getAddress());
		}
	}
	
	public void printAccounts(Set<Account> accounts)
	{
		System.out.println("AccountNo\tAccountType\t"
				+ "OpeningBalance\tOpeningDate\tDescription");
		System.out.println("-----------------------------------------------------------------");
		
		for(Account account:accounts)
		{
			System.out.println(account.getAccountNo()+"\t\t"+account.getAccountType()+
					"\t\t"+account.getOpeningBalance()+"\t\t"+account.getOpeningDate()+"\t"+
					account.getDescription());
		}
	}
	
	
	public Customer findallcustomers(List<Customer> customers)
	{
		
		System.out.println("Enter the First Name of the customer for whom you want to create account:");
		
		String name;
		
		name=sc.next();
		
		for(Customer cs : customers)
		{
			//System.out.println(cs.getCustomerId()+"  " +cs.getFirstName()+cs.getLastName() +" " + cs.getEmailId()+" " + cs.getMobileNo() + cs.getAddress());
	 
		if(name.compareTo(cs.getFirstName())==0)
		{
			return cs;
		}
		
		}
		
		return null;
	}
        
        public Account getAccount(long accNo, Set<Account> accounts)
        {
            for(Account acc:accounts)
            {
                if(acc.getAccountNo()==accNo)
                    return acc;
            }
            System.out.println("Enter valid account number!");
            return null;
            }
        
	
	public Customer findCustomerAccounts(List<Customer> customers)
	{
		
		System.out.println("Enter the First Name of the customer for creating account/printing summary:");
		
		String name;
		
		name=sc.next();
		
		for(Customer cs : customers)
		{
			
		if(name.compareTo(cs.getFirstName())==0)
		{
			return cs;
		}
		
		}
		System.out.println("Invalid customer name!");
		return null;
	}
	
	
	public Account createAccounts(Customer customer)
	{	
		
		System.out.println("Enter the type of the account you want to create:"
				+ "\n(SAVINGS, CURRENT, RD or FD):");
		
		boolean flag=true;
		AccountType type=AccountType.valueOf(sc.next().toUpperCase());
		Account account=new Account();
		       for(Account ac : accounts )
		       {
		       if(ac.getAccountType().compareTo(type)==0)
		       {
		       System.out.println("Account already exists!");
		       flag=false;
		       }
		       }
		       if(flag)
		       {
					account.setAccountNo(Utility.generateNumber());
					account.setAccountType(type);
					
					if(type==AccountType.SAVINGS)
						account.setOpeningBalance(1000);
					else if(type==AccountType.CURRENT)
						account.setOpeningBalance(2000);
					else if(type==AccountType.FD)
						account.setOpeningBalance(5000);
					else if(type==AccountType.CURRENT)
						account.setOpeningBalance(7000);
					account.setOpeningDate(LocalDate.now());
					account.setDescription("The account is created on "+account.getOpeningDate());
					accounts.add(account);
					customer.setAccounts(accounts);
					
		       }
		       return account;
	}
	
        
        public Transaction createTransactionDebitCredit(Account account, int typeOfTransaction)
        {
            Transaction transaction=new Transaction();
            transaction.setTransactionId(Utility.generateNumber());
            transaction.setTransactionDate(LocalDate.now());
            double amt;
            switch(typeOfTransaction)
            {
               case 1:
                   transaction.setTransactionType("Credit");
                   System.out.println("Enter the amount to be deposited:");
                   amt=sc.nextDouble();
                   transaction.setAmount(amt);
                   transaction.setFromAccount(null);
                   transaction.setToAccount(account);
                   transaction.setDescription("Amount "+amt+" is credited to account number "+account.getAccountNo());
                   break;
               case 2:
                   transaction.setTransactionType("Debit");
                   System.out.println("Enter the amount to be withdrawn:");
                   amt=sc.nextDouble();
                   transaction.setAmount(amt);
                   transaction.setFromAccount(account);
                   transaction.setToAccount(null);
                   transaction.setDescription("Amount "+amt+" is debited from account number "+account.getAccountNo());
                   break;    
                default:
                    System.out.println("Error occured! Try again!");
                    break;
               }
              
            return transaction;
            }
        
        public Transaction createTransactionFundTransfer(Account fromAcc, Account toAcc)
        {
            Transaction transaction=new Transaction();
            transaction.setTransactionId(Utility.generateNumber());
            transaction.setTransactionDate(LocalDate.now());
            double amt;
                   transaction.setTransactionType("Fund Transfer");
                   System.out.println("Enter the amount to be deposited:");
                   amt=sc.nextDouble();
                   transaction.setAmount(amt);
                   transaction.setFromAccount(fromAcc);
                   transaction.setToAccount(toAcc);
                   transaction.setDescription("Amount "+amt+" is transfered to account number "+toAcc.getAccountNo()+
                           " from account number "+fromAcc.getAccountNo());
                  
            return transaction;
        }
        
        
        public List<Transaction> getTransactionSummary(Account account)
        {
            TransactionServiceImpl transactionServices=new TransactionServiceImpl();
            return transactionServices.getAllTransactions(account);
        }
        
        
        public double getCurrentBalance(Account account)
        {
            double currentBal,openingBal;
            openingBal=account.getOpeningBalance();
            currentBal=openingBal;
            TransactionServiceImpl transactionServices=new TransactionServiceImpl();
            List<Transaction> transactions= transactionServices.getAllTransactions(account);
            
            for(Transaction element:transactions)
            {
                if(element.getTransactionType().equals("Debit"))
                    currentBal-=element.getAmount();
                else if(element.getTransactionType().equals("Credit"))
                    currentBal+=element.getAmount();
                else if(element.getTransactionType().equals("Fund Transfer"))
                {
                    if(element.getFromAccount()==null)
                        currentBal+=element.getAmount();
                    else
                        currentBal-=element.getAmount();
                }
            }
            return currentBal;
        }

}
