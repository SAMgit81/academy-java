package com.bptn.course._week_3_friday_big_coding._3_1;

import java.util.HashMap;
import java.util.Map;

public class Store {

	// create the map instance variable
	Map<String, Integer> map = new HashMap<>();

	public Store() {
		// Initialize the products map with default values
		map.put("apple", 10);
		map.put("banana", 5);
		map.put("orange", 0);

	}

	public void purchase(String product, int quantity) throws OutOfStockException {
		// Check if the product is available in the store. Hint: Use the map
		if (map.containsKey(product)) {
			// If not, throw an OutOfStockException with a message indicating the product is
			// not available.
		} else {
			throw new OutOfStockException("Product " + product + " not available in store");
		}
		// Check if there is enough stock for the desired quantity. Hint: Use the map
		if (map.get(product) >= quantity) {
			// If not, throw an OutOfStockException with a message indicating the product is
			// out of stock.
		} else {
			throw new OutOfStockException("Product " + product + " out of stock");
		}
	}
}