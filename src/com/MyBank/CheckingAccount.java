package com.MyBank.Account;

import com.MyBank.InsufficientFundsException;

public class CheckingAccount extends AbstractAccount{
	
	public CheckingAccount(String customer, String accountName, double balance,
			String accountNumber) {
		super(customer,accountName,balance,accountNumber);
		
	}
	
	public Double deposit(double amount) throws IllegalArgumentException{
		//validate amount is good
		checkAmountIsPositiveElseThrow(amount);
		
		return super.deposit(amount);
		
		/*if(amount > 0.0){
			super.deposit(amount);
			return Double.valueOf(amount);
		}else{
			IllegalArgumentException e =new IllegalArgumentException("Invalid amount to deposit" + amount);
			throw e;
		}
		*/
	}
	//returns the amount after withdrawing
	public Double withdraw(double amount) throws InsufficientFundsException{
		
		checkAmountIsPositiveElseThrow(amount);
		
		checkForSufficientFundsElseThrow(amount);
		
			if(this.getBalance() >= amount ){
				super.withdraw(amount);
				return Double.valueOf(amount);
			
		}else{
			System.out.println("Insufficient funds:"+ this.getBalance());
			return null;
		} 
		}
	
	

	
	public Double transfer(AbstractAccount toAccount, double amount) throws InsufficientFundsException {
		checkAmountIsPositiveElseThrow(amount);
		
		checkForSufficientFundsElseThrow(amount);
		
		return super.transfer(toAccount, amount);
				
			
			
		}
		
		
	}


