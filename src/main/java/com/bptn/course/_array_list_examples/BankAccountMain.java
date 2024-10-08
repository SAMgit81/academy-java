package com.bptn.course._array_list_examples;

import java.util.ArrayList;

public class BankAccountMain {

	public static void main(String[] args) {
		// Create an ArrayList of BankAccount objects
		ArrayList<BankAccount> accounts = new ArrayList<>();

		// Add BankAccount objects to the ArrayList
		accounts.add(new BankAccount("12345", 1500.75));
		accounts.add(new BankAccount("67890", 2450.50));
		accounts.add(new BankAccount("54321", 3400.00));
		accounts.add(new BankAccount("98765", 500.25));

		// Variable to hold the total balance
		double totalBalance = 0.0;

		// Using a for-each loop to iterate through the ArrayList and calculate total
		// balance
		for (BankAccount account : accounts) {
			totalBalance += account.balance; // Sum the balance of each account
		}

		// Print the total balance
		System.out.println("Total Balance in all accounts: $" + totalBalance);
	}
}