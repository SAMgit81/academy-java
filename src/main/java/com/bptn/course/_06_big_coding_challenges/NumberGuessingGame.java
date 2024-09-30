package com.bptn.course._06_big_coding_challenges;

import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		// Declare varibles
		int targetNumber = 23;
		int guess;

		// Create scanner to read user input
		Scanner scanner = new Scanner(System.in);
		// Print for user to enter their number to guess
		System.out.println("Enter the number: ");
		guess = scanner.nextInt();
		// do-while loop to find
		do {
			// check if user input is less than the targetNumber
			if (guess < targetNumber) {
				System.out.println("Too low! Try again.");
				guess = scanner.nextInt();
			}
			// check if user input is greater than the targetNumber
			else if (guess > targetNumber) {
				System.out.println("Too high! Try again.");
				guess = scanner.nextInt();
			}
			// check if user input is equal to targetNumber
			else if (guess == targetNumber) {
				System.out.println("Congratulations! You guessed the number correctly!");
				break;
			} else {
				System.out.println("Please enter a number between 1 and 100.");
				guess = scanner.nextInt();
			}
			// Close loop with condition as follow
		} while (guess >= 1 && guess <= 100);
		// close the scanner
		scanner.close();
	}
}