package com.bptn.course._11_access_modifiers._01_package_a;

public class AnotherClassA {

	public static void main(String[] args) {

		// create an obj of class A
		ClassA myObj1 = new ClassA();
		// we cannot access private instance nor methods from different class

		myObj1.publicMehtod();
		System.out.println("Accessing private method: " + myObj1.publicVar);
		// we can access protected method and var from diff class when they have the
		// same package
		myObj1.protectedMehtod();
		System.out.println("Accessing private method: " + myObj1.protectedVar);
		// we can access default method and var from diff class when they have the same
		// package
		myObj1.defaultMehtod();
		System.out.println("Accessing private method: " + myObj1.defaultVar);

	}

}
