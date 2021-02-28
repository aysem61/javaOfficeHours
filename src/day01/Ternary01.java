package day01;

import java.util.Scanner;

public class Ternary01 {

	public static void main(String[] args) {
		
		/*/*
	 * Type java code by using ternary and if-else, ask user to enter an integer, if
	 * the integer is even, the output will be “The integer is even”. If the integer
	 * is odd, the output will be “The integer is odd”
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an integer");
		
		int num=scan.nextInt();
		
		String result1 = num%2==0 ? "The intger is even":"The integer is odd";
		System.out.println(result1);
		
	 /* Type java code by using ternary .Ask user to enter two integers Write a
	 * program to print the minimum one on the console.
	 */
		  
		 System.out.println("Please enter two an integer");
		 		
		  int a=scan.nextInt();
		  int b=scan.nextInt();
		  
		  int result=a>b ? b:a;
		  System.out.println(result);
		
		
	}

}
