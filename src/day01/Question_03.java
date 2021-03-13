package day01;

import java.util.Scanner;

public class Question_03 {

	public static void main(String[] args) {
		
		
		/*Write a Java program to print the sum(addition),multiply,subtract(cikarmak),divide two numbers.
		 * EXAMPLE:
		 *   INPUT:
		 *   first number:125
		 *   second number:25
		 *   OUTPUT:
		 *   The sum of two numbers is:150
		 *   The difference of two numbers is:100
		 *   The product of two numbers is:3125
		 *   The division of two numbers is:5.0
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter two numbers");
		double num1=scan.nextDouble();
		double num2=scan.nextDouble();
		
		System.out.println("The sum of two numbers is:" +(num1+num2));
		
		System.out.println("The difference of two numbers is:" +(num1-num2));
		
		System.out.println("The product of two numbers is:" +(num1*num2));
		
		System.out.println("The division of two numbers is:" +(num1/num2));
		

	}

}
