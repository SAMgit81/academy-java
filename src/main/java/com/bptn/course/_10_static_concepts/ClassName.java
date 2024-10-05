package com.bptn.course._10_static_concepts;

public class ClassName {

	// declare static variable
	static int staticVariable = 100;

	// declare instance variable
	int instanceVariable;

	// declare a static method
	static void staticMethod() {
		System.out.println("Static method is called..");

		// access an instance variable ? no
		// instanceVariable=100;

		// access an instance method
		// instanceMethod();

	}

	void instanceMethod() {
		System.out.println("Instance method is called..");
		System.out.println("Static variable: " + staticVariable);

		staticMethod();

	}

	public static void main(String[] args) {

		ClassName c1 = new ClassName();
		c1.instanceMethod();

		// Access the static variable
		System.out.println("Static variable: " + staticVariable);

		staticMethod();
	}

}
//Key take away
// we can't access instance var or method within a static method
// we can access static var and method within instance 
// we can access static var and method within the main method