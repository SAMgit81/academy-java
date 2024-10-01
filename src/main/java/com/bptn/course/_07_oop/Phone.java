package com.bptn.course._07_oop;

public class Phone {
	// decalre a private attributes
	private int weight;
	private int height;
	private int width;
	private String color;

	// constructor
	public Phone() {
		// assign default values
		weight = 150;
		height = 140;
		width = 70;
		color = "Black";
	}

	// 4 Parameter constructor
	public Phone(int w, int h, int wi, String c) {
		weight = w;
		height = h;
		width = wi;
		color = c;
	}

	// 3 Parameter constructor
	public Phone(int w, int h, int wi) {
		weight = w;
		height = h;
		width = wi;
	}

	// declare instance method
	public static void makePhoneCall() {
		System.out.println("Make a phone call");
	}

	// declare instance method
	public static void sendTextMessage() {
		System.out.println("Send a text message");
	}

	public static void main(String[] args) {
		// create an object of the phone class using default constructor
		Phone myObj1 = new Phone();

		System.out.println("Default Phone: " + "Weight: " + myObj1.weight + " Height: " + myObj1.height + " Width: "
				+ myObj1.width + " Color: " + myObj1.color);

		// print parameter 3 constructor
		Phone myObj3 = new Phone(100, 200, 300);

		System.out.println("Default Phone: " + "Weight: " + myObj3.weight + " Height: " + myObj3.height + " Width: "
				+ myObj3.width);

		// print parameter 4 constructor
		Phone myObj2 = new Phone(125, 150, 200, "Blue");

		System.out.println("Default Phone: " + "Weight: " + myObj2.weight + " Height: " + myObj2.height + " Width: "
				+ myObj2.width + " Color: " + myObj2.color);

		myObj1.makePhoneCall();
		myObj2.sendTextMessage();

	}

}