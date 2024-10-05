package com.bptn.course._08_polymerphism_;

//parent class
class Shape {

	// method
	void drawAngle() {
		System.out.println("Draw Angle");
	}
}

//sub-class 
class Rectangle extends Shape {

	// overrid method
	// use the same method as the parent class
	@Override
	void drawAngle() {
		System.out.println("Draw Rectangle");

	}
}

public class Polymerphism2 {
	public static void main(String[] args) {
		// create obj to display the overriden class
		Rectangle r1 = new Rectangle();
		r1.drawAngle();
		Rectangle r2 = new Rectangle();
		r2.drawAngle();

	}
}
