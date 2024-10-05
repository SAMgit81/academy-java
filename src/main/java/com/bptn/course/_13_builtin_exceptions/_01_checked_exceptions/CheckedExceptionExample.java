package com.bptn.course._13_builtin_exceptions._01_checked_exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionExample {

	// create a method which read a title
	public static void readFile(String fileName) throws FileNotFoundException {

		// cerate an object of FileReader

		FileReader fileReader = new FileReader(fileName);

	}

	public static void main(String[] args) {

		// checked exception
		try {
			readFile("result.text");

		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException occured " + e.getMessage());
		}

	}

}
