package com.bptn.course._16_java_collection_list._01_arraylist._coding_33;

import java.util.ArrayList;
import java.util.List;

public class Main {

	// Complete the functionality of the method below
	public static List<String> convertArrayToList(String[] inputArray) {

		// Create a new ArrayList of String.
		ArrayList<String> inputArrayString = new ArrayList<>();

		// Iterate inputArray using a for-each loop and add the elements to the new
		// ArrayList. Hint: Use add() method to add elements to ArrayList.
		for (String elements : inputArray) {
			inputArrayString.add(elements);
		}
		// return the new list with elements.
		return inputArrayString;
	}

	// Do not modify the code below
	public static void main(String[] args) {

		String[] cars = { "Volvo", "Honda", "Ford" };

		List<String> arraylist = convertArrayToList(cars);

		System.out.println(arraylist);
	}
}
