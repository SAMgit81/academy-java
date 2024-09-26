package com.bptn.course._04_arrays;

public class Array {

	public static void main(String[] args) {
		// Declare and initialize an array with 6 varibles
		int[] myArray = { 3, 5, 7, 9, 11, 13 };
		System.out.println(myArray);
		System.out.println("First elment: " + myArray[0]);

		System.out.println("Secon element: " + myArray[1]);

		// update the first element to 38
		myArray[0] = 30;

		System.out.println("First elment: " + myArray[0]);

		// update the last element with only the properties

		System.out.println("Update the last element: " + myArray[myArray.length - 1]);

		// traditional for loop

		// use for loop to print all the elements of the
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}

		// print all elements without using for loop

		// System.out.println(myArray.toString(myArray);

		for (int i = myArray.length - 1; i >= 0; i--) {
			System.out.println(myArray[i]);
		}

		// Emhanced for-loop (for-each-loop)
		for (int element : myArray) {
			System.out.println(element);
		}

	}
}
