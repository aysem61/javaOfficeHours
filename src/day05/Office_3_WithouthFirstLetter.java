package day05;

import java.util.Scanner;

public class Office_3_WithouthFirstLetter {

	public static void main(String[] args) {

		/*
		 * StringMethods Write a Java program to read a string and if the first or last
		 * characters are 't', return the string without those 't' otherwise return the
		 * string unchanged.
		 * 
		 * Example: INPUT : The given strings is: testcricket OUTPUT : The new string
		 * is: estcricke
		 * 
		 */

		Scanner s = new Scanner(System.in);

		System.out.println(" Please enter a word");

		String word = s.nextLine().toLowerCase();

		System.out.println(StringMethods(word));

		s.close();
	}

	private static String StringMethods(String word) {

		if (word.startsWith("t") && word.endsWith("t")) {

			return word.substring(1, word.length() - 1);

		} else if (word.startsWith("t")) {

			return word.substring(1);

		} else if (word.endsWith("t")) {
			return word.substring(0, word.length() - 1);
		} else {
			return word;
		}

	}

	
}
