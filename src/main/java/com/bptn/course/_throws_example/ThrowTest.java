package com.bptn.course._throws_example;

public class ThrowTest {

	public static void checkAge(int age) {
		if (age < 18) {
			throw new IllegalArgumentException("Age must be 18 or above");
		} else {
			System.out.println("Access granted.");
		}
	}

	public static void main(String[] args) {
		try {
			// Throws IllegalArgumentException
			checkAge(15);
		} catch (IllegalArgumentException e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
	}

}
