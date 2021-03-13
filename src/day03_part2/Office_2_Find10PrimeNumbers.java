package day03_part2;

import java.util.ArrayList;
import java.util.List;

public class Office_2_Find10PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 /*
        * Write a program that accepts an integer as input and prints first 10 prime
        * numbers greater than input
        *
        * Check numbers if they are even or not in a return method
        *
        *	Prime Numbers: 2 3 5 7 11...
        */
		
		int input = 5;
		int count = 0;
		
		List<Integer> first10Primes = new ArrayList<>();
		
		while(count < 10) {
			input++;
			if(isPrime(input)) {
				count++;
				first10Primes.add(input);
			}
		}
		
		System.out.println(first10Primes);

	}

	public static boolean isPrime(int num) {
		
		if(num !=2) {
			
			for(int i=2; i < num; i++) {
				
				if(num%i == 0) {
					
					return false;
				}
			}
		}
		return true;
	}

}
