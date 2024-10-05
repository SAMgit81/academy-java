package com.bptn.course._12_wrapper_class;

public class Main {

	public static void main(String[] args) {
		// Auto boxing - converting primitive data into wrapper class(int to Integer)
		Integer intObject = Integer.valueOf(100);

		// we can also convert to primitive type to wrapper class under
		Integer intObject1 = 20;

		// Unboxing - converting wrapper class to primitive type
		int intPrimitive = intObject;
		// Alternative way to unboxing
		int intPrimitive1 = intObject.intValue();

	}

}
