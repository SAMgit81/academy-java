package com.bptn.course._13_builtin_exceptions._02_unchecked_exceptions;

public class BuiltinExceptionExample {

	// create a method which checks if a number is postive or negative
	// throws always comes in the method signature
	// method has the ability to encounter a stitutation and should be in a postion
	// to handle
	// throw create an instance Exception or subclass - always comes new
	public static void checkPositive(int number) throws IllegalArgumentException {
		if (number < 0) {
			throw new IllegalArgumentException("The number must be postive");
		}

		System.out.println("The number is postive ");

	}

	public static void main(String[] args) {

		try {
			checkPositive(10);
			checkPositive(-10);

		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException has occured " + e.getMessage());
		}

	}

}
