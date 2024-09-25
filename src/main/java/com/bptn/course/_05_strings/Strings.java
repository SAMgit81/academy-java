package com.bptn.course._05_strings;

public class Strings {

	public static void main(String[] args) {

		// Create a new string
		String s = "Hello World";
		String reversedWord = "";

		int stringLength = s.length();
		System.out.println("Length is: " + stringLength);

		String sub = s.substring(0, 5);
		System.out.println("The substring is: " + sub);

		String sub1 = s.substring(3);
		System.out.println("The substring is: " + sub1);

		// toLowerCase
		String lowerCaseCasting = s.toLowerCase();
		System.out.println("The lowercase of the string: " + lowerCaseCasting);

		// toUpperCase
		String upperCaseCasting = s.toUpperCase();
		System.out.println("The lowercase of the string: " + upperCaseCasting);

		// indexOf
		int findIndex = s.indexOf("World");
		System.out.println("The lowercase of the string: " + findIndex);

		// Find character

		// Reverse
		for (int i = s.length() - 1; i >= 0; i--) {
			reversedWord += s.charAt(i);
		}
		System.out.println("The reversed word is " + reversedWord);

	}
}
