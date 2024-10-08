package com.bptn.course._17_java_collection_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// Create LinkedHashSet obj
		Set<String> linkedHashSet = new LinkedHashSet<>();

		linkedHashSet.add("apple");
		linkedHashSet.add("banana");
		linkedHashSet.add("cherry");
		linkedHashSet.add("mango");
		linkedHashSet.add("apple");

		System.out.println("The LinkedHashSet is" + linkedHashSet);

	}

}
