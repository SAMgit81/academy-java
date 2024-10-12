package com.bptn.course._week_3_friday_big_coding._3_1;

public class Main {
	// Do not modify this code
	public static void main(String[] args) {
		Store store = new Store();
		try {
			store.purchase("apple", 11);
			System.out.println("Purchase successful!");
		} catch (OutOfStockException e) {
			System.out.println(e.getMessage());
		}
	}
}