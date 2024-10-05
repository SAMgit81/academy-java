package com.bptn.course._13_builtin_exceptions._02_unchecked_exceptions;

public class ArthmeticExceptionExample {

	public static void main(String[] args) {
		// critical statment

		try {
			int result = 10 / 0;
			System.out.println("The result is: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Number cannot be divid by 0" + e.getMessage());

		}

	}

}
