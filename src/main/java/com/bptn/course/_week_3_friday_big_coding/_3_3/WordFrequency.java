package com.bptn.course._week_3_friday_big_coding._3_3;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
	public static void main(String[] args) {
		String sentence = "This is a test sentence with no repeating words";

		// Split the sentence into words using split() method

		String[] words = sentence.split(" ");
		// Create a Map to store the frequency of each word
		Map<String, Integer> wordFrequency = new HashMap<>();

		// Iterate through each word in the sentence
		for (String word : words) {
			// If the word is already in the map, increment its frequency
			if (wordFrequency.containsKey(word)) {
				int incrementedFrequency = wordFrequency.get(word) + 1;
				wordFrequency.put(word, incrementedFrequency);
				// Call the put() method to replace the previous entry in the map with the new
				// frequency using the word as the
				// map key and the incremented frequency as the map value.
			}
			// If the word is not in the map, add it with a frequency of 1
			else {
				wordFrequency.put(word, 1);

			}
		}

		// Print the frequency of each word
		System.out.println("Word frequency: " + wordFrequency);
	}
}
