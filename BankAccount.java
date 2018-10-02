package hw3;

import java.util.ArrayList;

public class BankAccount implements Comparable<BankAccount>{

	private int accountNumber;
	private double balance;
	public BankAccount(int accountNumber, double balance) {
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	public double getbalance()
	{
		return balance;
	}
	@Override
	public int compareTo(BankAccount theAccount) {
		
		if(this.balance < theAccount.balance)
		{
			return -1;
		}
		else if(this.balance==theAccount.balance)
		{
			return 0;
		}
		else
		{
			return 1;
		}
		
	}
	public String toString() {
	    return  "AccountNumber:" + accountNumber + " balance:" + balance;
	}

}
