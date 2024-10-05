package com.bptn.course._11_access_modifiers._02_package_b;

import com.bptn.course._11_access_modifiers._01_package_a.ClassA;

public class ClassB extends ClassA {

	public static void main(String[] args) {
		// create an obj of class A
		ClassA myObj1 = new ClassA();
		// public - is Accessble from a different package
		myObj1.publicMehtod();
		System.out.println("Accessing private method: " + myObj1.publicVar);

		// Create sub class object
		ClassB myObj2 = new ClassB();

		// we cannot access default method nor var from different package
//		myObj2.defaultMehtod();
//		System.out.println("Accessing private method: " + myObj2.defaultVar);
		// prottected method and var can be accessable from sub class
		myObj2.protectedMehtod();
		System.out.println("Accessing private method: " + myObj2.protectedVar);

	}

}
