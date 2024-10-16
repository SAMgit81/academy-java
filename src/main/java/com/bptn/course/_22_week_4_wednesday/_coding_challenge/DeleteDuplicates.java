package com.bptn.course._22_week_4_wednesday._coding_challenge;

import java.util.ArrayList;
import java.util.List;

public class DeleteDuplicates {

	/*
	 * This method deletes duplicates from an unsorted ArrayList.
	 * 
	 * @param nums the sorted ArrayList with duplicates
	 * 
	 * @return a sorted ArrayList without duplicates
	 */
	public static List<Integer> deleteDuplicates(List<Integer> nums) {

		// Check if the list is null or empty, and return an empty list if so
		if (nums == null || nums.size() == 0) {
			// no item to be removed
			// return and empty arraylist
			return new ArrayList<>();
			// ...
		}
		// Implement the bigger details of your algorithm here...
		// create an arrayList to hold a unique elements
		List<Integer> uniqueElements = new ArrayList<>();

		// use for loop to iterate through elements and only add unique elements
		for (int i = 0; i < nums.size(); i++) {

			if (i == 0 || !nums.get(i).equals(nums.get(i - 1))) {
				// add the unique element to the list
				uniqueElements.add(nums.get(i));
			}
		}

		// return sortedAndUnique list without duplicate
		return uniqueElements;
	}

	public static void main(String[] args) {
		// Initialize a sample sorted ArrayList with duplicate values
		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(3);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(5);

		// Call the deleteDuplicates method with the sample list as argument
		List<Integer> result = deleteDuplicates(nums);

		// Print the result to the console
		System.out.println(result);
	}
}
