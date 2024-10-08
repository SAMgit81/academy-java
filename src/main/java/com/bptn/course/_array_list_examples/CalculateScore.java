package com.bptn.course._array_list_examples;

import java.util.ArrayList;

public class CalculateScore {

	public static void main(String[] args) {
		// Create an ArrayList to store student scores
		ArrayList<Integer> scores = new ArrayList<>();
		scores.add(75);
		scores.add(80);
		scores.add(98);
		scores.add(82);

		// Calculate total score using a for-loop
		int totalScore = 0;
		for (int i = 0; i < scores.size(); i++) {
			totalScore += scores.get(i);
		}

		// Calculate average score
		double averageScore = (double) totalScore / scores.size();

		// Display the result
		System.out.println("Total Score: " + totalScore);
		System.out.println("Average Score: " + averageScore);
	}
}
