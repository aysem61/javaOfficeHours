package javaOfficeHours;

import java.util.Scanner;

public class Question_04 {

	public static void main(String[] args) {

		/*
		 * Ask user to enter two numbers Show them a menu of operation signs and ask
		 * them to choose one. "Addition: 1 , Subtraction : 2 , Multiplication : 3,
		 * Division : 4 Print the result on the console
		 * 
		 * EXAMPLE: INPUT: Num1 : 50 Num2 : 5 Which operation do you prefer? 1 for
		 * Addition 2 for Subtraction 3 for Multiplication 4 for Division select 1
		 * Result= 55
		 */

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please eneter two numbers");
		
		double num1=scan.nextDouble();
		double num2=scan.nextDouble();
		
//		System.out.println(" 1 for Addition :" +(num1+num2));
//		
//		System.out.println(" 2 forSubtraction :" +(num1-num2));
//		
//		System.out.println("3 for Multiplication :" +(num1*num2));
//		
//		System.out.println("4 for Division :" +(num1/num2));
		
		
		
		//System.out.println("enter of the operations number");
		
		
        
        System.out.println("Which operation do you prefer? \n 1 for Addition\n 2 for Subtraction\n 3 for Multiplication\n 4 for Division");
       
        int a=scan.nextInt();
		
        switch(a) {
			case 1:
				System.out.println(" 1 for Addition :" +(num1+num2));
				break;
			case 2:
				System.out.println(" 2 forSubtraction :" +(num1-num2));
				break;
			case 3:
				System.out.println("3 for Multiplication :" +(num1*num2));
				break;
			case 4:
				System.out.println("4 for Division :" +(num1/num2));
				break;
			default:
					System.out.println("invalid number");
		}
			
		
		
		
		
	}

}
