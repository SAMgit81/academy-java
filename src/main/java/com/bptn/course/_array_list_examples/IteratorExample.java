package com.bptn.course._array_list_examples;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		// Create an ArrayList to store the restaurant menu
		ArrayList<String> menu = new ArrayList<>();
		menu.add("Spaghetti Bolognese");
		menu.add("Grilled Chicken");
		menu.add("Caesar Salad");
		menu.add("Tacos");
		menu.add("Sushi");

		// List of unavailable dishes
		ArrayList<String> unavailableDishes = new ArrayList<>();
		unavailableDishes.add("Tacos");
		unavailableDishes.add("Sushi");

		// Using Iterator to remove unavailable dishes
		Iterator<String> iterator = menu.iterator();
		while (iterator.hasNext()) {
			String dish = iterator.next();
			if (unavailableDishes.contains(dish)) {
				iterator.remove(); // Remove unavailable dish from the menu
			}
		}

		// Print the updated menu
		System.out.println("Updated Menu: " + menu);
	}
}
