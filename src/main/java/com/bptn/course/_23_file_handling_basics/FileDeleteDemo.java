package com.bptn.course._23_file_handling_basics;

import java.io.File;

public class FileDeleteDemo {

	public static void main(String[] args) {
		File file = new File("sample.txt");
		if (file.exists()) {
			System.out.println("File Found! Deleting now..");
		}
		if (file.delete()) {
			System.out.println("File deleted!");
		}

	}

}
