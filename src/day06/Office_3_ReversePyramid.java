package day06;

import java.util.Scanner;

public class Office_3_ReversePyramid {

	public static void main(String[] args) {
		/*
		 *  Create the following pattern
			Enter the number of rows:
				5
		 		* * * * *
		 		* * * *
		 		* * *
		 		* *
		 		*
		 *
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int rows=scan.nextInt();
		
		for(int i=0; i<rows; i++) {
			
			for(int j=0; j<i; j++) {
				System.out.println(" ");
			}
			
			for(int k=0; k<rows-i; k++) {
				System.out.print( "*");
			}
		}
				
				
				
				
		

	}

}
