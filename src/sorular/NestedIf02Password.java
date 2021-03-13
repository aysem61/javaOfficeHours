package sorular;

import java.util.Scanner;

public class NestedIf02Password {

	
	/*
	 * Type java code by using nested if() statement. Ask user to enter a password
	 * If the initial of the password is uppercase then check if it is ‘A’ or not.
	 * If it is ‘A’ the output will be “Valid Password” otherwise the output will be
	 * “Invalid Password” for example;Ali==>Valid password - ali==> Invalid - Mark ==>Invalid
	 *  If the initial of the password is lowercase then check if it is
	 * ‘z’ or not. If it is ‘z’ the output will be “Valid Password” otherwise the
	 * output will be “Invalid Password” for example;zoe==>Valid
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s=new Scanner(System.in);
		
	    System.out.println("Please enter a valid password ");
	    
	    String pas=s.next();
	    
	    
	    if( ( pas.charAt(0)>='A' && pas.charAt(0)<='Z')) {
	    	
	    	System.out.println(" The password is valid ");
	    }else if (pas.charAt(0)>='a' && pas.charAt(0)<='y' ){
	    	System.out.println(" your password is invalid ");
	    	
	    }else {
	    	if(pas.charAt(0)=='z') {
	    		System.out.println(" your passord is valid ");
	    	}else {
	    		System.out.println("your pass is invalid ");
	    	}
	    }
		
	}

}
