package com.MyBank;

import com.MyBank.Account.AbstractAccount;
import com.MyBank.Account.CheckingAccount;
import com.MyBank.Account.SavingsAccount;

import java.util.List;
import java.util.Arrays;
//import java.util.ArrayList;

public class MusicalChairs {

	public static void main(String[] args) throws InsufficientFundsException {
	
		// two bank account, please
		CheckingAccount one = new CheckingAccount(
		        "customer one",
		        "customer one account",
		        100.0,
		        "c1");
		SavingsAccount two = new SavingsAccount(
		        "saver two",
		        "saver's savings account",
		        100.0,
		        "s2"
		);
		CheckingAccount three = new CheckingAccount(
		  "customer three",
		  "customer three's account",
		  100.0,
		  "c3"
		);
		SavingsAccount four = new SavingsAccount(
		        "saver four",
		        "saver four's savings account",
		        100.0,
		        "s4"
		);
		CheckingAccount five = new CheckingAccount(
		        "customer five",
		        "customer five's account",
		        100.0,
		        "c5"
		);
		
		
		List<AbstractAccount> allAccounts = Arrays.asList(one, two, three, four, five);
		for(int amount = 1; amount < 1000; amount++) {
		    int i = amount % 5;
		    int j = (i + 1)%5;
		    AbstractAccount fromAccount = allAccounts.get(i);
		    AbstractAccount toAccount = allAccounts.get(j);
		    
		    // transfer money!!!
		    //System.out.println("Transferring from account:"+ fromAccount.getAccountName()+"with index number" + i);
		    Double transferredAmount = fromAccount.transfer(toAccount, amount);
		    
		    // check if transfer worked, if not, break out of loop
		    if( transferredAmount == null){
		    	//System.out.println("first account to get empty is:"+ fromAccount.getAccountName());
		    	break;
		    }
		}
	
		// print all balances at the end of the game
		// hint: System.out.println("Account one balance: " + one.getBalance());
		System.out.println("Account one balance: " + one.getBalance());
		System.out.println("Account two balance: " + two.getBalance());
		System.out.println("Account three balance: " + three.getBalance());
		System.out.println("Account four balance: " + four.getBalance());
		System.out.println("Account five balance: " + five.getBalance());
		
	}
}