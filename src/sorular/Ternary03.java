package sorular;

import java.util.Scanner;

public class Ternary03 {

	public static void main(String[] args) {
		/*
	 * Ask user to enter an integer. If the number has 3 digits, output will be
	 * “This number has 3 digits.” Otherwise, output will be “This number has no 3
	 * digits.” How can you decide the number of digits of an integer?
	 */
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Please enter the integer");
		  int a=scan.nextInt();
		  
		 String result= (a<1000 && a>99) || (a<-99 && a>-1000) ? "This number has 3 digits" :"This number has no 3 digits";
			 System.out.println(result);
			 
		/*/*
	 * Type java code by using nested ternary. Write a program to check if a year is
	 * leap year or not. If the year is divisible by 100 then it must be divisible
	 * by 400. If a year is not divisible by 100 then it must be divisible by 4.
	 */
		 
		//LeapYearUnterviewQuestionWithTernary
			 
		System.out.println("Enter the year");
		int year=scan.nextInt();
		
		String result1=(year%100==0)?(year%400==0 ? "The year is leap year" :"The year is not leap year"):
			
			(year%4==0 ? "The year is leap year" :"The year is not leap year");
		System.out.println(result1);
			
		 

	}

}
