package com.MyBank.Account;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CheckingAccountTest {
	// class under test
	CheckingAccount account;

	@BeforeEach
	void setup() {
		account = new CheckingAccount("customer 1", "test account", 0, "test account number");

	}

	/*
	 * @Test void test() { fail("Not yet implemented"); }
	 */

	@Test
	void deposit__amount_greater_than_zero__works() {

		// try with good amount(>0)
		double amount = 42.0;
		// do the actual test
		account.deposit(amount);

		// get the actual balance
		double balance = account.getBalance();

		// check it did work

		assertEquals(amount, balance);
	}

	@Test
	void deposit__amount_less_than_zero__throws() {

		// bad amount
		double amount = -1.0;
		

		assertThrows(IllegalArgumentException.class, () -> {
			account.deposit(amount);
		});

		// if we get here,the test failed
		//fail("Expected a throw,but deposit did not throw");
	}
	
	@Test
	void deposit__amount_equal_to_zero__throws() {
		//another bad amount
		double amount = 0.0;
		
		assertThrows(IllegalArgumentException.class, () -> {
			account.deposit(amount);
		});
		
	}

}
