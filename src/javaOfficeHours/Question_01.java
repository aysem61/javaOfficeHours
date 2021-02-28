package javaOfficeHours;

import java.util.Scanner;

public class Question_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		/*
		 * Write a Java program that accepts two integer numbers and checks if they are
		 * equal. EXAMPLE: first integer number:1234  
		 * 					second integer number:1234
		 * OUTPUT:
		 * These numbers are equal
		 */

		System.out.println("Please enter two an integer");
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		if(a==b) {
			System.out.println("These numbers are equal");
		}else {
			System.out.println("These numbers are diffrent");
		}
	}

}
