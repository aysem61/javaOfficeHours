package day02;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		
		
		/*
		 * 
		 * 
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("How many tea do you drink in a day?");
		double tea=scan.nextDouble();
		
		System.out.println("How many suhar do you use for a glass of tea?");
		double sugar=scan.nextDouble();
		
		
		double usageYEarly=tea*sugar*2.7*365/1000;
		
		//double usageFourtly=usageYearly*40;
		
		//float usageYearlyFlt=(float) usageYearly;
		
		//float usageYearlyFlt=(float) usageFourtly;
		
		if(sugar==0) {
			System.out.println("Good Job,less sugar more health");
		}else {
			//System.out.println("Your yearly usage is : " + usageYearly + "kg");
			//System.out.println("Your usage for 40 years is :" +usageFourty +"kg");
		}

	}

}
