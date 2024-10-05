package com.bptn.course._09_abstraction_;

//cannot be used to create obj
//can carry abstract and non abstract method
abstract class Shape {

	// Abstract method - a method which has no impelmentation
	abstract void draw();

	abstract void print();

	// normal methods - which has an implementation
	void moveTo(int x, int y) {
		System.out.println("Move to: " + x + y);
	}

}

//sub class

class Rectangle extends Shape {

	@Override
	void draw() {
		System.out.println("Draw a rectangle");

	}

	@Override
	void print() {
		System.out.println("Print a rectangle");

	}

}

class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("Draw a circle");

	}

	@Override
	void print() {
		System.out.println("Print a circle");

	}

}

public class Abstraction {

	public static void main(String[] args) {

		// Create objects from Circle class
		Circle c1 = new Circle();
		c1.draw();
		c1.print();
		c1.moveTo(2, 3);// inheritance method from shape class

		Rectangle r1 = new Rectangle();
		r1.draw();
		r1.print();
		r1.moveTo(2, 3);// inheritance method from shape class

	}

}
