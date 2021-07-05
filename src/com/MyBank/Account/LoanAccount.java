package com.MyBank.Account;

public class LoanAccount extends AbstractAccount{

	public LoanAccount(String customer, String accountName, double balance,
			String accountNumber) {
		super(customer, accountName, balance, accountNumber);
		
	}
	
	public double repayments(){
		double amount = 500;
		return amount;
	}
}
