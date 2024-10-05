package com.bptn.course._14_custom_exception._01_custom_exception1;

public class InsufficientFundsException extends Exception {

	private static final long serialVersionUID = 1L;

	private double amount;

	public InsufficientFundsException(double amount) {

		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

}
