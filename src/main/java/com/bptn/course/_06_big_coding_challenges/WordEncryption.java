package com.bptn.course._06_big_coding_challenges;

import java.util.Scanner;

public class WordEncryption {

	public static void main(String[] args) {
		// create scanner to read user input
		Scanner scanner = new Scanner(System.in);

		// Declare variable
		String word;

		// Write string builder for encrypted word
		StringBuilder encrypted = new StringBuilder();

		// Get user input
		System.out.println("Enter the word to encrypt: ");
		word = scanner.nextLine();

		// create a for loop to check each character in the word
		for (int i = 0; i < word.length(); i++) {
			char givenCharacter = word.charAt(i);

			//

			// Uppercase encrypt
			if (givenCharacter > 'A' && givenCharacter <= 'Z') {
				char encryptedCharacter = (char) (givenCharacter + 1);
				if (encryptedCharacter > 'Z') {
					encryptedCharacter = 'A';
				}
				encrypted.append(encryptedCharacter);
			}
			// Lower case encrypt
			else if (givenCharacter > 'a' && givenCharacter <= 'z') {
				char encryptedCharacter = (char) (givenCharacter + 1);
				if (encryptedCharacter > 'z') {
					encryptedCharacter = 'z';
				}
				encrypted.append(encryptedCharacter);
			}
		}
		// Print the encrypted word
		System.out.println("Encrypted word: " + encrypted.toString());
		// close scanner
		scanner.close();
	}
}
