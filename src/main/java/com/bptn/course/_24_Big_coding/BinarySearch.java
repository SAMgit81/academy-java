package com.bptn.course._24_Big_coding;

import java.util.Arrays;

public class BinarySearch {

	// Binary search method that takes an unsorted array and a key element to search
	// for
	public static int binarySearch(int[] arr, int key) {
		// Sort the array before applying binary search
		Arrays.sort(arr);

		// Initialize low and high pointers for the start and end of the array
		// respectively
		int low = 0;
		int high = arr.length - 1;

		// Keep looping until the high pointer is greater than or equal to the low
		// pointer
		while (high >= low) {
			// Calculate the middle index
			int mid = (low + high) / 2;
			// If the element at the middle index is equal to the key, return the index
			if (arr[mid] == key) {
				return mid;
			}
			// If the element at the middle index is less than the key, move the low pointer
			// to the middle + 1
			else if (arr[mid] < key) {
				low = mid + 1;
			}
			// If the element at the middle index is greater than the key, move the high
			// pointer to the middle - 1
			else {
				high = mid - 1;
			}
		}
		// If the key is not found, return -1
		return -1;

	}

	// Do not modify the code below
	public static void main(String[] args) {

		// Create an Array of integers
		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
		// Key to be searched for:
		int key = 22;

		// Perform binary search on the Array
		int result = binarySearch(arr, key);

		// Print the result
		if (result == -1) {
			System.out.println("Element not found in the array");
		} else {
			System.out.println("Element found at index " + result);
		}
	}
}

//Summary 
//First part was sorting the array using Arrays.sort()
//Then we declared low and high variables 
//We used a while loop and to continue the iteration until high is greater or equal to low
//if the mid index is equal to the key, it will return the index
//if the mid index is less than to the key, it will shift the index to the right
//if the mid index is greater than to the key, the high will move to the mid - 1
//Finally it will return -1 if the key is not found 
