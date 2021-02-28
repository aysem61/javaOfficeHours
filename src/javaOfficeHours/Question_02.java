package javaOfficeHours;

import java.util.Scanner;

public class Question_02 {

	public static void main(String[] args) {
		
		/*Write a program in Java to input 5 numbers from keyboard and
		 * find their sum and average.
		 * EXAMPLE:
		 * INPUT:
		 * Input the 5 numbers:
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5
		 * OUTPUT:
		 * The sum of 5 number is:15
		 * The Average is:3.0 ==>Ortalama
		 */
				Scanner scan=new Scanner(System.in);
				System.out.println("Please enter the 5 numbers");
				
				double num1=scan.nextDouble();
				double num2=scan.nextDouble();
				double num3=scan.nextDouble();
				double num4=scan.nextDouble();
				double num5=scan.nextDouble();
				
				
				System.out.println("sum :" +(num1+num2+num3+num4+num5));
				
				 
				System.out.println("Average:" +((num1+num2+num3+num4+num5)/5));
				
				scan.close();
				
	}

}
