package com.bptn.course._throws_example;

public class ThrowableTest {

	public static void main(String[] args) {
		try {
			// Declare array variable with an integer values
			int[] numbers = { 1, 2, 3 };

			// Throws ArrayIndexOutOfBoundsException
			// print out user input if index is length - 1

			System.out.println(numbers[8]);

		} catch (Throwable c) {
			System.out.println("Index can not be out of bound: " + c.getMessage());
		}
	}

}
