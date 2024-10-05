package com.bptn.course._09_abstraction_;

//abst using java 8
interface Operations {
	void draw();

	// default method has some impelemntation
	default int add(int a, int b) {
		return a + b;

	}

	// static method
	static double getRandomNumber() {
		return Math.random();
	}
}

//sub class
class Calculator implements Operations {

	@Override
	public void draw() {
		System.out.println("Draw method implemented by calculator class");

	}

}

public class Abstraction3 {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.draw();

		int result = c1.add(2, 3);
		System.out.println("The result is: " + result);
		System.out.println("The random number is: " + Operations.getRandomNumber());

	}

}
