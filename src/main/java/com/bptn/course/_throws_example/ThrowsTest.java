package com.bptn.course._throws_example;

public class ThrowsTest {

	// Unchecked Exception
	// throws IllegalArgumentException IF number is negative
	public static int squareRoot(int number) throws IllegalArgumentException {
		if (number < 0) {
			throw new IllegalArgumentException("Number cannot be Negative.");
		}
		return (int) Math.sqrt(number);

	}

	public static void main(String[] args) {
		// try-catch to handle what has been thrown from square root method
		try {
			int result = squareRoot(-4);
			System.out.println("Result: " + result);
		} catch (IllegalArgumentException e) {
			System.out.println("Illegal Argument Exception occured " + e.getMessage());

		}

	}

}
