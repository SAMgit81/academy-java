package com.bptn.course._14_custom_exception._01_custom_exception1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount b1 = new BankAccount(1000, "4322");

		try {
			b1.withdraw(200);
			b1.withdraw(600);
			b1.withdraw(600);
		} catch (InsufficientFundsException e) {
			System.out.println("InsufficientFundsException occured " + "You need " + e.getAmount() + e.getMessage());
		}

	}

}
