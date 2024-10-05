package com.bptn.course._throws_example;

public class RestaurantReservation {

	// Method to reserve seats using built-in exceptions
	public static void reserveSeat(String customerName, int numberOfPeople, int availableSeats) {
		// Throw IllegalArgumentException if the customer name is invalid
		if (customerName == null || customerName.isEmpty()) {
			throw new IllegalArgumentException("Customer name cannot be null or empty.");
		}

		// Throw IllegalArgumentException if the number of people is invalid
		if (numberOfPeople <= 0) {
			throw new IllegalArgumentException("Number of people must be at least 1.");
		}

		// Throw ArrayIndexOutOfBoundsException if trying to reserve more seats than
		// available
		if (numberOfPeople > availableSeats) {
			throw new ArrayIndexOutOfBoundsException("Not enough seats available.");
		}

		// Simulate successful reservation
		System.out.println("Reservation successful for " + numberOfPeople + " people under the name " + customerName);
	}

	public static void main(String[] args) {
		int availableSeats = 5; // Number of available seats at the restaurant

		try {
			// Try to reserve seats with invalid customer name
			reserveSeat("", 2, availableSeats);
		} catch (IllegalArgumentException e) {
			System.out.println("Reservation failed: " + e.getMessage());
		}

		try {
			// Try to reserve more seats than available
			reserveSeat("Alice", 6, availableSeats);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Reservation failed: " + e.getMessage());
		}

		try {
			// Try to reserve seats with an invalid number of people
			reserveSeat("Bob", 0, availableSeats);
		} catch (IllegalArgumentException e) {
			System.out.println("Reservation failed: " + e.getMessage());
		}

		try {
			// Valid reservation
			reserveSeat("Charlie", 3, availableSeats);
			System.out.println("Reservation successful!");
		} catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Reservation failed: " + e.getMessage());
		}
	}
}
