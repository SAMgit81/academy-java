package com.bptn.course._22_week_4_wednesday._coding_challenge._sorting_example;

import java.util.Arrays;

public class BubbleSort {

	static void bubbleSort(int array[]) {
		int size = array.length;

		// loop for ever
		for (int i = 0; i < size - 1; i++) {
			// inner loop
			for (int j = 0; j < size - 1; j++) {
				// comparision
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {
		int[] data = { 5, 3, -1, 7, 10, 2 };
		System.out.println("Before sort: " + Arrays.toString(data));
		bubbleSort(data);
		System.out.println();
		System.out.println("After sort: " + Arrays.toString(data));

	}

}
