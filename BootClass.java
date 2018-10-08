package org.capg.boot;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.capg.model.Account;
import org.capg.model.Customer;
import org.capg.model.Transaction;
import org.capg.service.AccountServiceImpl;
import org.capg.service.CustomerServiceImpl;
import org.capg.service.IAccountService;
import org.capg.service.ICustomerService;
import org.capg.service.TransactionServiceImpl;
import org.capg.view.UserInteraction;

public class BootClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		UserInteraction userinteraction = new UserInteraction();
		
		ICustomerService customerservices = new CustomerServiceImpl();
		AccountServiceImpl accountServices = new AccountServiceImpl();
		TransactionServiceImpl transactionServices = new TransactionServiceImpl();
		int ch,temp;
		
		boolean flag=true;
		
		String name;
		
		int l=0;
		
		while(flag)
		{
			System.out.println("1.Create a customer");
			System.out.println("2.List the customers");
			System.out.println("3.Create account for a customer");
			System.out.println("4.Perform transactions");
                        System.out.println("5. Get transaction summary/Print current balance for an account");
			ch=scanner.nextInt();
			
			if(ch==1)
			{
				customerservices.createCustomer(userinteraction.getCustomerDetails());
				
			}
			else if(ch==2)
			{
				List<Customer> customers = customerservices.getAllCustomers();
				userinteraction.printCustomers(customers);
			}
			
			else if(ch==3)
			{

				List<Customer> customers = customerservices.getAllCustomers();
				Customer customer=userinteraction.findallcustomers(customers);
				
				if(customer==null)
				{
					System.out.println("invalid customer name!");
				}
				else
				{
				  accountServices.createAccount(userinteraction.createAccounts(customer));
				  System.out.println(customer.getAccounts());
				}
				
				
			}
			
			else if(ch==4)
			{
				int transactionType;
				long accountNo;
                                Account account=new Account();
                                Account transferAmtAccount=new Account();
				List<Customer> customers = customerservices.getAllCustomers();
				Customer customer=userinteraction.findCustomerAccounts(customers);
				System.out.println("Accounts of the mentioned customer are:");
				Set<Account> accounts = accountServices.getAccountsForCustomer(customer);
				userinteraction.printAccounts(accounts);
                                
               
                                boolean flag1=false;
                                do
                                {
                                    System.out.println("\n\n");
                                    System.out.println("Enter number for the type of transaction:"
                                                    + "\n1.Deposit\n2.Withdrawal\n3.Fund Transfer");
                                    transactionType=scanner.nextInt();

                                    if(transactionType==1)
                                    {
                                        System.out.println("Enter the account number for transaction:");
                                        accountNo=scanner.nextLong();
                                        account=userinteraction.getAccount(accountNo, accounts);
                                            transactionServices.createTransaction(account,userinteraction.createTransactionDebitCredit(account,transactionType));

                                    }
                                    else if(transactionType==2)
                                    {
                                        System.out.println("Enter the account number for transaction:");
                                        accountNo=scanner.nextLong();
                                        account=userinteraction.getAccount(accountNo, accounts);
                                            transactionServices.createTransaction(account,userinteraction.createTransactionDebitCredit(account,transactionType));

                                    }
                                    else if(transactionType==3)
                                    {
                                        System.out.println("Enter the account number FROM which amt to be transfered:");
                                        accountNo=scanner.nextLong();
                                        account=userinteraction.getAccount(accountNo, accounts);
                                        System.out.println("Enter the account number TO which amt to be transfered:");
                                        accountNo=scanner.nextLong();
                                        transferAmtAccount=userinteraction.getAccount(accountNo, accounts);
                                            transactionServices.createTransaction(account,userinteraction.createTransactionFundTransfer(account,transferAmtAccount));
                                            transactionServices.createTransaction(transferAmtAccount,userinteraction.createTransactionFundTransfer(account,transferAmtAccount));

                                    }
                                    else
                                    {System.out.println("Enter correct option!");
                                    flag1=true;
                                    }
                                }while(flag1==true);
				
			}
                        else if(ch==5)
                        {
                            int choice;
                            System.out.println("Enter number for:\n1.Transaction Summary\n2.Checking current balance");
                            choice=scanner.nextInt();
                            long accountNo;
                            Account account=new Account();
                            List<Customer> customers = customerservices.getAllCustomers();
				Customer customer=userinteraction.findCustomerAccounts(customers);
				System.out.println("Accounts of the mentioned customer are:");
				Set<Account> accounts = accountServices.getAccountsForCustomer(customer);
				userinteraction.printAccounts(accounts);
                                
                            System.out.println("\nEnter the account number for which you want to perform action:");
                            accountNo=scanner.nextLong();
                            account=userinteraction.getAccount(accountNo, accounts);
                            
                            if(choice==1)
                            {
                                System.out.println("\nTRANSACTION SUMMARY FOR ACCOUNT NUMBER "+accountNo);
                                List<Transaction> transactions=userinteraction.getTransactionSummary(account);
                                for(Transaction element:transactions)
                                {
                                    System.out.println(element);
                                }
                            }
                            else if(choice==2)
                            {
                                System.out.println("\nCURRENT BALANCE for account number "+accountNo+" is:");
                                System.out.println(userinteraction.getCurrentBalance(account));
                            }
                            else
                                System.out.println("Invalid choice! Try again!");
                        }
			
			System.out.println("enter 1 to continue and 2 to exit");
			temp=scanner.nextInt();
			
			if(temp==2)
			{
				flag=false;
			}
		}
		
		
	}

}
