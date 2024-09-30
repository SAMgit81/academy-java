package com.bptn.course._06_big_coding_challenges;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// Decalare valibles
		int firstNumber;
		int secondNumber;
		int total;

		// Decalare scanner to read user input
		Scanner scanner = new Scanner(System.in);
		// do-while loop to repeateadly ask the user to Enter a
		// number until the condition is false
		do {

			// Print menu for user to select the number of their choice
			System.out.println("/...Calculator Menu.../");
			System.out.println(" Press 1 for addition ");
			System.out.println(" Press 2 for subtraction ");
			System.out.println(" Press 3 for multiplication ");
			System.out.println(" Press 4 for division ");
			System.out.println(" Press 5 to square a number ");
			System.out.println(" Press 6 to find a square root ");
			System.out.println(" Press 7 to find the reciprocal ");
			int choice = scanner.nextInt();

			// Calculate addition when choice is equals to 1
			if (choice == 1) {
				System.out.println("Enter the first number: ");
				firstNumber = scanner.nextInt();
				System.out.println("Enter the second number: ");
				secondNumber = scanner.nextInt();

				total = firstNumber + secondNumber;
				System.out.println("The total of two numbers is: " + total);
			}
			// Calculate subtraction when choice is equals to 2
			else if (choice == 2) {
				System.out.println("Enter the first number: ");
				firstNumber = scanner.nextInt();
				System.out.println("Enter the second number: ");
				secondNumber = scanner.nextInt();

				total = firstNumber - secondNumber;
				System.out.println("The subtraction of two numbers is: " + total);
			}
			// Calculate the product when choice is equals to 3
			else if (choice == 3) {
				System.out.println("Enter the first number: ");
				firstNumber = scanner.nextInt();
				System.out.println("Enter the second number: ");
				secondNumber = scanner.nextInt();

				total = firstNumber * secondNumber;
				System.out.println("The product of the numbers: " + total);
			}
			// Calculate division when choice is equals to 4
			else if (choice == 4) {
				System.out.println("Enter the first number: ");
				firstNumber = scanner.nextInt();
				System.out.println("Enter the second number: ");
				secondNumber = scanner.nextInt();

				total = firstNumber / secondNumber;
				System.out.println("The division of the numbers is: " + total);
			}
			// Calculate square when choice is equals to 5
			else if (choice == 5) {
				System.out.println("Enter the number to find square: ");
				firstNumber = scanner.nextInt();

				total = firstNumber * firstNumber;
				System.out.println("The square of " + firstNumber + " is: " + total);
			}
			// Calculate Square root of the number when choice equals to 6
			else if (choice == 6) {
				System.out.println("Enter the number to find square root: ");
				firstNumber = scanner.nextInt();

				double totalSuareRoot = Math.sqrt(firstNumber);
				System.out.println("The square root of: " + firstNumber + " is " + totalSuareRoot);
			}
			// Calculate reciprocal when choice equals to 7
			else if (choice == 7) {
				System.out.print("Enter a number to find a reciprocal: ");
				double number = scanner.nextDouble();

				double reciprocal = 1 / number;
				System.out.println("The reciprocal of " + number + " is " + reciprocal);
			}
			// else print Invalid choice
			else {
				System.out.println("Invalid choice");
				break;
			}
		}
		// repeat the the program till condition is flase
		while (true);
		// close the scanner
		scanner.close();
	}
}