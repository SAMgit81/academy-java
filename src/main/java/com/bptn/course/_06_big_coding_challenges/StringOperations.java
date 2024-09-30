package com.bptn.course._06_big_coding_challenges;

import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
		// Create scanner to read user input
		Scanner scanner = new Scanner(System.in);
		// Declare a variable
		String firstString;
		String secondString;
		int choice;
		// do-while loop
		do {
			// Print menu for user to choose
			System.out.println("/...String Menu.../");
			System.out.println(" Press 1 for Palindrome Check ");
			System.out.println(" Press 2 to reverse a String ");
			System.out.println(" Press 3 to Concatenate two Strings ");
			System.out.println(" Press 4 for String Comparison ");
			System.out.println(" Press 5 to Calculate the Length of String ");
			choice = scanner.nextInt();

			// check if the two strings are equal method
			if (choice == 1) {
				System.out.println("Enter a string to check if it's a palindrome: ");
				firstString = scanner.nextLine();
				scanner.nextLine();

				String reversed = new StringBuilder(firstString).reverse().toString();
				if (firstString.equals(reversed)) {

					System.out.println(firstString + "is a palindrome");
				} else {
					System.out.println(firstString + "is not palindrome");
				}

				// Print reverse string
			} else if (choice == 2) {
				System.out.println("Enter string to reverse: ");
				String original = scanner.nextLine();
				scanner.nextLine();

				String reversed = new StringBuilder(original).reverse().toString();
				System.out.println("The reversed string is: " + reversed);

				// Print Concatenate strings
			} else if (choice == 3) {
				System.out.println("Enter the first string: ");
				firstString = scanner.nextLine();
				scanner.nextLine();
				System.out.println("Enter the first string: ");
				secondString = scanner.nextLine();

				String concatenateNumbers = firstString + secondString;
				System.out.println("The Concatenated of two string is: " + concatenateNumbers);

				// Print compare strings
			} else if (choice == 4) {
				System.out.println("Enter two strings to check if they are equal or not ");
				firstString = scanner.nextLine();
				scanner.nextLine();
				System.out.println("Enter the first string: ");
				secondString = scanner.nextLine();

				if (firstString.equals(secondString)) {
					System.out.println("The entered strings are equal.");
				} else {
					System.out.println("The entered strings are not equal.");
				}

				// Print length
			} else if (choice == 5) {
				System.out.println("Enter a string to find the Length: ");
				firstString = scanner.nextLine();
				scanner.nextLine();

				System.out.println("The length is " + firstString.length());
			} else {
				System.out.println("Invalid choice! Please make a valid choice.");
				choice = scanner.nextInt();
			}
		} while (choice != 6);
		scanner.close();
	}
}
