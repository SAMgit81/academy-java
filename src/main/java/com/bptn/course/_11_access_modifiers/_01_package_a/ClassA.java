package com.bptn.course._11_access_modifiers._01_package_a;

public class ClassA {

	// declare a private var
	private int privateInt;

	// declare a public var
	public int publicVar;

	// declare a protected var
	protected int protectedVar;

	int defaultVar;

	// private void method
	private void privateMehtod() {
		System.out.println("This is a private method");
	}

	// public void method
	public void publicMehtod() {
		System.out.println("This is a private method");
	}

	// default void method
	void defaultMehtod() {
		System.out.println("This is a private method");
	}

	// protected void method
	protected void protectedMehtod() {
		System.out.println("This is a private method");
	}

	public static void main(String[] args) {
		// create an obj of class A
		ClassA myObj1 = new ClassA();
		// we can access private var or method in the same class
		myObj1.privateMehtod();
		System.out.println("Accessing private method: " + myObj1.privateInt);
		// we can access public var or method in the same class
		myObj1.publicMehtod();
		System.out.println("Accessing private method: " + myObj1.publicVar);
		// we can access protected var or method in the same class
		myObj1.protectedMehtod();
		System.out.println("Accessing private method: " + myObj1.protectedVar);

		myObj1.defaultMehtod();
		System.out.println("Accessing private method: " + myObj1.defaultVar);

	}

}
