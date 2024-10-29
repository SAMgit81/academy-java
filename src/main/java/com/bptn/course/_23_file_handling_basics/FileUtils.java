package com.bptn.course._23_file_handling_basics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtils {

	public static void main(String[] args) {
		FileUtils fileUtils = new FileUtils();

		String DIRECTORY_PATH = System.getProperty("user.dir") + "/";

		String filePath = DIRECTORY_PATH + "test.txt";

		System.out.println(filePath);

		fileUtils.writeFile(Paths.get(filePath));
		fileUtils.updateFile(Paths.get(filePath));
		fileUtils.readFile(Paths.get(filePath));
		FileUtils.deleteFile(Paths.get(filePath));
	}

	// the isFileExist() method should be here
	public static boolean isFileExist(String filePath) {
		File file = new File(filePath);
		// return true if file exists
		return file.exists();
	}

	// the isFileExistsWithExceptionHandling() should be here
	// define readFile()
	public static void readFile(Path path) {
		try {
			FileReader reader = new FileReader("student.txt");
			try (BufferedReader bufferedReader = new BufferedReader(reader)) {
				String line;
				while ((line = bufferedReader.readLine()) != null) {
					System.out.println(line);
				}
			}
		} catch (IOException e) {
			System.out.println("Somethin went wrong while creating the file: " + e.getMessage());
		}
	}

	// the createFileIfNotExist() method should be here
	public static void createFileIfNotExist(String filePath) {
		File file = new File(filePath);
		if (!file.exists()) {
			try {
				if (file.createNewFile()) {
					System.out.println("File created successfully: " + filePath);
				} else {
					System.out.println("Failed to create file.");
				}
			} catch (IOException e) {
				System.out.println("An error occured while creating the file.");
				e.printStackTrace();
			}
		} else {
			System.out.println("File already exists: " + filePath);
		}
	}

	// define deleteFile()
	public static void deleteFile(Path path) {
		File file = new File("test.txt");
		if (file.exists()) {
			System.out.println("File Found! Deleting now..");
		}
		if (file.delete()) {
			System.out.println("File deleted!");
		}
	}

	// define writeFile()
	public static void writeFile(Path path) {
		try {
			FileWriter writer = new FileWriter("test.txt");
			writer.write("This is a new File");
			System.out.println("File created");
			writer.close();
		} catch (IOException e) {
			System.out.println("Something went wrong while creating the file: ");
			e.printStackTrace();
		}
	}

	// define updateFile()
	public static void updateFile(Path path) {
		try {
			FileWriter writer = new FileWriter("sample.txt", true);
			writer.write("This is a new file");
			System.out.println("File created");
			writer.close();

		} catch (IOException e) {
			System.out.println("Something went wrong while creating the file: ");
			e.printStackTrace();
		}
	}
}