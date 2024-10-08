package com.bptn.course._16_java_collection_list._01_arraylist._coding_33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main1 {

	// Simple method forward approach without using for loop or methods
	public static void main(String[] args) {

		String[] cars = { "Volvo", "Honda", "Ford" };
		List<String> newList = new ArrayList<>(Arrays.asList(cars));

		// Print the values
		System.out.println("The converted arrayList is: " + newList);

	}

}
