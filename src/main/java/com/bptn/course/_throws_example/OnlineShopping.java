package com.bptn.course._throws_example;

public class OnlineShopping {

	// method to check if the item is added correctly
	public void addItem(String item) {
		if (item == null) {
			// Throw NullPointerException if the item is null
			throw new NullPointerException("Item cannot be null! Please add a valid item.");
		} else {
			System.out.println(item + " added to cart.");
		}
	}

	public static void main(String[] args) {
		// Create an object from onlineShopping class
		OnlineShopping cart = new OnlineShopping();

		// Check to see when we add a null item
		try {
			cart.addItem(null);
		} catch (NullPointerException e) {
			// Handle the exception
			System.out.println("Null Pointer Exception Occured: " + e.getMessage());
		}
	}
}
