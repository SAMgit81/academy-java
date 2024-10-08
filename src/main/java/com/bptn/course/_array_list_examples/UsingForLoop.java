package com.bptn.course._array_list_examples;

import java.util.ArrayList;

public class UsingForLoop {

	public static void main(String[] args) {
		// Create an ArrayList of Integers
		ArrayList<Integer> numbers = new ArrayList<>();

		// Add elements to the ArrayList
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);

		// Variable to hold the total
		int sum = 0;

		// Using a for-loop to iterate through the ArrayList and sum the elements
		for (int i = 0; i < numbers.size(); i++) {
			// Access each element using the get() method and add it to sum
			sum += numbers.get(i);
		}

		// Print the total sum
		System.out.println("The sum of all numbers is: " + sum);
	}
}
