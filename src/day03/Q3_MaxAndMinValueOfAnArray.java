package day03;

public class Q3_MaxAndMinValueOfAnArray {
		
		/*Write a method that accepts an integer array as input and prints the minimum 
		 * and the maximum numbers from given array
		 * 
		 * Input:{3,2,5,4,1,6}
		 * Output:min:1
		 *		max:6	 
		 * 
		 * 
		 */
		public static void main(String[] args) {
			int input []={3,2,5,4,1,6};
			
			maxAndmin(input);
			
	}
		public static void maxAndmin(int input[]) {
			int max=input[0];
			int min=input[0];
			
			
			for(int i =0; i<input.length; i++) {
				
				if(input[i]>max) {
					max=input[i];
				}
				
				if(input[i]<min) {
					min=input[i];
				}
			}
				System.out.println("Max Value: " + max  +  "Min Value : " + min);
				
			
		}
	

}
