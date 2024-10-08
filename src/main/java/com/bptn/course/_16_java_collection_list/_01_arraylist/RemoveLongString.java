package com.bptn.course._16_java_collection_list._01_arraylist;

import java.util.ArrayList;

public class RemoveLongString {

	public static void removeLongStrings(ArrayList<String> list) {
		// code here
		// in-order to avoid loop shifting we can loop through from the last to first
		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i).length() > 4) {
				list.remove(i);
			}
		}
	}

	public static void main(String[] args) {
		// instantiate ArrayList and fill with Strings
		ArrayList<String> values = new ArrayList<String>();
		String[] words = { "bathtub", "fish", "computer", "cat", "foo" };
		for (int i = 0; i < words.length; i++) {
			values.add(words[i]);
		}
		removeLongStrings(values);
		System.out.println("Expected Result:\t [fish, cat, foo]");
		System.out.println("Your Result:\t\t " + values);
	}
}
