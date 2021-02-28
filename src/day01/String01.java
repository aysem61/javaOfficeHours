package day01;

import java.util.Scanner;

public class String01 {

	public static void main(String[] args) {
		
		/*
         * Ask user to enter a String and  a character,
         * then check if the String has the character or not
         
         */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a String and a character");
		
		String a=scan.nextLine();
		
		char ch=scan.next().charAt(0);
		
		if(a.indexOf(ch)==-1) {
			System.out.println("The String has no such a character");
		}else {
			System.out.println("The has String has a character");
		}

	}

}
