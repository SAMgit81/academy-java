package com.bptn.course._08_polymerphism_;

public class Polymorphism3 {

	void print(int integer) {
		System.out.println("Printing an integer: " + integer);
	}

	void print(String s) {
		System.out.println("Printing an integer: " + s);
	}

	int print(int a, int b) {
		return a + b;
	}

	double print(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		Polymorphism3 p1 = new Polymorphism3();
		p1.print(5);
		p1.print("Hello world");

		System.out.println("The sum of two integers: " + p1.print(1, 2));
		System.out.println("The sum of two integers: " + p1.print(1.1, 2.2));

	}

	// Method overloading - compile time
	// inheritance is not required. within the same class

}
