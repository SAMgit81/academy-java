package com.bptn.course._java_collections_map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// Create hashMap object
		Map<Integer, String> number = new HashMap<>();

		number.put(1, "one");
		number.put(2, "Two");
		number.put(3, "three");
		number.put(4, "four");
		number.put(5, "five");
		number.put(6, "six");
		number.put(7, "seven");
		number.put(8, "eight");
		number.put(9, "nine");
		number.put(10, "ten");

		// Print the map using entry

		for (Map.Entry<Integer, String> entry : number.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		number.remove(7);
		number.put(11, "eleven");

		for (Map.Entry<Integer, String> entry : number.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
