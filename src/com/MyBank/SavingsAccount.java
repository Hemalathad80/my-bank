 package com.MyBank.Account;

import com.MyBank.InsufficientFundsException;

public class SavingsAccount extends AbstractAccount {

	public SavingsAccount(String customer, String accountName, double balance,
			String accountNumber) {
		super(customer, accountName, balance, accountNumber);
	}

	public Double deposit(double amount) throws IllegalArgumentException {

		checkAmountIsPositiveElseThrow(amount);
		
		return super.deposit(amount);
		 /*else {
			IllegalArgumentException e = new IllegalArgumentException(
					"Invalid amount to deposit" + amount);
			throw e;

		}*/

	}

	public Double withdraw(double amount) throws UnsupportedOperationException,InsufficientFundsException {
		throw new UnsupportedOperationException("Cannot withdraw from a savings account");
		
	}

	public Double transfer(AbstractAccount toAccount, double amount)
			throws InsufficientFundsException {

		checkAmountIsPositiveElseThrow(amount);

		checkForSufficientFundsElseThrow(amount);

		return super.transfer(toAccount, amount);

	}

}
