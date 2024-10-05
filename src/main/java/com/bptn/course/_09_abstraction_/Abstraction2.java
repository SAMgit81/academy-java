package com.bptn.course._09_abstraction_;

public class Abstraction2 {

	interface ShapeInterface {
		// create abstract method

		void draw();

		double getArea();

	}

	// create sub class to implement interface

	class RectangleClass implements ShapeInterface {

		private double width;
		private double height;

		@Override
		public void draw() {
			System.out.println("Draw a rectangle");

		}

		@Override
		public double getArea() {

			return width * height;
		}

	}

	public static void main(String[] args) {
		// create an obj from rectangle class
//		RectangleClass r1 = new RectangleClass();
//		r1.getArea();

	}

}
