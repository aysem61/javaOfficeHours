package day03_part2;

import java.util.ArrayList;
import java.util.List;

public class Office_4_MultidimensionalArrayToList {

	public static void main(String[] args) {
		/*
		 * Write a return method that accepts an Multidimensional Array as input Puts
		 * all elements in a new list and prints all elements in natural order
		 *
		 * Eg : Input : {{John,Brad,Fox},{Lee,Ali},{Suzan}} Output:[Ali, Brad, Fox,
		 * John, Lee, Suzan]
		 */

		String[][] input = { { "John", "Brad", "Fox" }, { "Lee", "Ali" }, { "Suzan" } };
		printList(input);

	}

	public static void printList(String[][] input) {

		List<String> list = new ArrayList<>();

		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				list.add(input[i][j]);
			}
			System.out.println(list);
		}

	}

}