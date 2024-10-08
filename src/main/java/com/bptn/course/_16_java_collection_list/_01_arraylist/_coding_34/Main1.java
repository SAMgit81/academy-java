package com.bptn.course._16_java_collection_list._01_arraylist._coding_34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main1 {

	// Simple method to convert ArrayList to Array
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<String>();

		nameList.add("Robert");
		nameList.add("Samson");
		nameList.add("Alex");
		nameList.add("William");

		System.out.println("Elements of List: " + nameList);

		// declare an array that length equals to size
		String[] output = new String[nameList.size()];
		output = nameList.toArray(output);

		// Print the element of the array in one line
		System.out.println("Elements of array " + Arrays.toString(output));
	}

}
