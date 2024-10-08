package com.bptn.course._16_java_collection_list._02_linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String> color = new LinkedList<>();

		// add elements to the list
		color.addFirst("blue");

		// add element to the end of list
		color.addLast("red");

		System.out.println("LinkedList after adding colors: " + color);

		// remove element from the beginning
		color.removeFirst();

		// remove element from the beginning
		color.removeLast();
		System.out.println("LinkedList after adding colors: " + color);

		color.add("blue");
		color.add("red");
		color.add("blue");
		color.add("green");
		color.add("black");

		System.out.println("LinkedList after adding colors: " + color);

		// remove element from index 1
		color.remove(1);

		System.out.println("LinkedList after removing index 1: " + color);

		// add element at index 1
		color.add(1, "white");
		System.out.println("LinkedList after removing index 1: " + color);

		// Access an element at index 2
		color.get(2);
		System.out.println("LinkedList after removing index 1: " + color);

		// Add null values
		color.add(null);

		System.out.println("LinkedList after removing index 1: " + color);

		// access element using for each
		for (String element : color) {
			System.out.println(element);
		}

		// access element using Iterator
//		Iterator<String> i = color.iterator();
//		while (i.hasNext()) {
//			System.out.println("Accessing using iterator" + i.next());
//		}

		// remove an element using iterator
//		System.out.println("Removing an element using iterator");
//
//		Iterator<String> iterator = color.iterator();
//
//		while (iterator.hasNext()) {
//			String colors = iterator.next();
//			if (colors.equals("red")) {
//				iterator.remove();
//				System.out.println("The color is removed successfully");
//
//			}
//		}

		// Add an element using ListIterator interface of iterator
		ListIterator<String> listIterator = color.listIterator();
		while (listIterator.hasNext()) {

			String color1 = listIterator.next();
			if (color.equals("blue")) {

				listIterator.add("black");
				System.out.println("The color is added successfully");

			}

		}
		System.out.println("LinkedList after adding color: " + color);

	}
}
