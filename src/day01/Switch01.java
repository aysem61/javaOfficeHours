package day01;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {

		/*
		 * /*If the user pressed 1, 2, 3 the program will print the number that is
		 * pressed; otherwise, program will print "Not allowed".
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = scan.nextInt();

		switch (a) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		default:
			System.out.println("Not allowed");

		}
		
		
		
		
		/*/*
 * Ask user ta enter one of the ‘U’, ’S’, and ‘A’. Then type a program by using
 * “switch statement” to print “United” for ‘U’ ”States” for ’S’, and “America”
 * for ‘A’
 */
			
		
		System.out.println("Please enter a character  as A or U or S ");

		char c=scan.next().toUpperCase().charAt(0); 
		
		switch(c) {
		
		case 'u':
		case 'U':
			System.out.print("United ");
		case 's':	
		case 'S':
			System.out.print("States ");
		case 'a':	
		case 'A':
			System.out.println(" America");
			break;
			
		default:
			System.out.println("Please enter correct character !");
		
		}
	}

}
