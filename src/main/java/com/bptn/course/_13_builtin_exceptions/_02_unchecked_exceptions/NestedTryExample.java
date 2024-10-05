package com.bptn.course._13_builtin_exceptions._02_unchecked_exceptions;

public class NestedTryExample {

	public static void main(String[] args) {
		// outer try-catch block

		try {
			int[] num = { 1, 2, 3, 4 };
			int divisor = 0;
			String text = null;

			// inner try-catch-block
			try {

				int result = 10 / 0;
				System.out.println("The result is: " + result);

			} catch (ArithmeticException e) {

				System.out.println("Number cannot be divid by 0" + e.getMessage());
			}

//			try {
//				System.out.println("The length of string is: " + text.length());
//
//			} catch (NullPointerException e) {
//				System.out.println("A nullpointer exception occured: " + e.getMessage());
//
//			}
			try {
				System.out.println(num[4]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("An Index out of bound" + e.getMessage());
			}
		} catch (Exception e) {
			System.out.println("An exception occured: " + e.getMessage());

		}
		System.out.println("Statement after try/catch block");
	}

}
