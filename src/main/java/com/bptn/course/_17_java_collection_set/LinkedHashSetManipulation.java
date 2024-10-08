package com.bptn.course._17_java_collection_set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetManipulation {

	public static void main(String[] args) {
		// Create a LinkedHashSet and populate it with the elements A, B and C.
		Set<String> set = new LinkedHashSet<>();

		set.add("A");
		set.add("B");
		set.add("C");
		// Print the size of the set
		System.out.println("Set size: " + set.size());
		// Use for each loop to print the elements in the set
		System.out.println("Elements in the set (using for each loop): ");
		for (String element : set) {
			System.out.println("Element: " + element);
		}

		// Use iterator to print the elements in the set
		System.out.println("Elements in the set (using iterator): ");
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println("Elements: " + it.next());
		}

		// Use remove() method to remove the element A from the set
		set.remove("A");

		System.out.println("Set after using remove(): " + set);
		// Use contains() method to check if the element B exists in the set
		if (set.contains("B")) {
			System.out.println("Element B exists in the set");
		} else {
			System.out.println("Element 'B' exists in the set.");
		}
		// Use clear() method to remove all elements from the set
		set.clear();
		// Print the set to show that it is empty.
		System.out.println("Set after using clear(): ");

	}
}
