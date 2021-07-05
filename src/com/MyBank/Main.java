package com.MyBank;

import com.MyBank.Account.CheckingAccount;
import com.MyBank.Account.SavingsAccount;

public class Main {
	public static void main(String[] args) {
		CheckingAccount one = new CheckingAccount("customer one",
				"customer one account", 100.0, "c1");
		
		SavingsAccount two = new SavingsAccount(
		        "saver two",
		        "saver's savings account",
		        100.0,
		        "s2"
		);
		try{
		one.transfer( two,-50.0);
		two.withdraw(-3.0);
		}catch(IllegalArgumentException|InsufficientFundsException| UnsupportedOperationException e){
			System.out.println(e);
		}
	}
}