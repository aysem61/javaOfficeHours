package day03;

public class Q2_AvarageValueOfAnArray {

	public static void main(String[] args) {
		
		/*
		 * Write a java program that calculates the average value of array elements
		 * 
		 * Input[]={1,2,3,4,5,6,7}
		 * 
		 * Output:4
		 * 
		 */
		
		int []input={1,2,3,4,5,6,7};
		
		int sum=0;
		
		for(int i=0; i<input.length; i++) {
			
			sum=sum+input[i];
			
		}
		//Calculate the average
		double avarege=sum/input.length;
		
		//Print the solution
		System.out.println("Avarege of elements in the given array" + avarege);
	

	}

}
