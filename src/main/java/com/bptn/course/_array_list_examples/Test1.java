package com.bptn.course._array_list_examples;

import java.util.ArrayList;

public class Test1 {

	public static void shiftLeftOne(ArrayList<Integer> list) {
		// code here
		if (list.size() > 0) {
			int firstValue = list.get(0);

			// using for-loop shift elements to the shift the left
			for (int i = 1; i < list.size(); i++) {
				list.set(i - 1, list.get(i));
			}

			// now lets save the last element to the first element
			list.set(list.size() - 1, firstValue);
		}
	}

	public static void main(String[] args) {
		// instantiate ArrayList and fill with Integers
		ArrayList<Integer> values = new ArrayList<Integer>();
		int[] nums = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < nums.length; i++) {
			values.add(nums[i]);
		}
		shiftLeftOne(values);
		System.out.println("Expected Result:\t [2, 3, 4, 5, 1]");
		System.out.println("Your Result:\t\t " + values);
	}
}
