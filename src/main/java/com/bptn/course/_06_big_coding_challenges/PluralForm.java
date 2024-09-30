package com.bptn.course._06_big_coding_challenges;

import java.util.Scanner;

public class PluralForm {

	public static void main(String[] args) {
		// Scanner class to read user input
		Scanner scanner = new Scanner(System.in);

		// Ask user to enter a postive number
		System.out.println("Enter a postive integer: ");
		int amt = scanner.nextInt();
		scanner.nextLine();
		// Ask user to enter a singular word
		System.out.println("Enter a singular word: ");
		String word = scanner.nextLine();

		// Plural the word
		String pluralWord = word;

		if (amt != 1) {
			if (word.endsWith("y") && !word.endsWith("ay") && !word.endsWith("ey") && !word.endsWith("oy")
					&& !word.endsWith("uy")) {
				pluralWord = word.substring(0, word.length() - 1) + "ies";
			} else if (word.endsWith("s") || word.endsWith("sh") || word.endsWith("ch") || word.endsWith("x")
					|| word.endsWith("z")) {
				pluralWord = word + "es";
			} else {
				pluralWord = word + "s";
			}
		}
		// Display the result
		System.out.println(amt + " " + pluralWord);
	}
}
