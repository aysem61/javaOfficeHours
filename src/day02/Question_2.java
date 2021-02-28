package day02;

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {

		crediCard();

	}

	private static void crediCard() {
		/*
		 * Ask user Name, Surname and credit card numbers than convert it to special
		 * form
		 *
		 * (Check credit card number, if there isn’t 16 digit print “Invalid credit card
		 * number”
		 *
		 * Input : John White 1234234534561478 Output : Name : J*** W**** CCN : ****
		 * **** **** 1478 (Initials for name and surname should be uppercase)
		 */
		
		Scanner s=new Scanner(System.in);
		
		System.out.println(" please enter your firstname");
		
		String fName=s.nextLine();
		
		String ff=fName.substring(0,1)+fName.substring(1).replaceAll("\\w","*");
		
		System.out.println(" please enter your surname");
		
		
		String sName=s.nextLine();
		
		String ss=sName.substring(0,1)+sName.substring(1).replaceAll("\\w", "*");
		
		System.out.println(" please enter your creditNumber ");
				
		String cNum=s.nextLine();
		
		String cc=cNum.substring(0,cNum.length()-4).replaceAll("\\w", "*")+cNum.substring(cNum.length()-4);
		
		if (cNum.length()==16) {
			
			
			System.out.println("First name :"+ff+" Surname :"+ss+" Credit Cardnumber :"+cc);
			
			
		}else {
			System.out.println("Invalid credit Card Number ");
		}
		
		
		
		
		/* Hocanin cozumu 
		 *  Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter your first name");
        
        String firstName = scan.next();
        
        System.out.println("Please enter your surname");
        
        String surname = scan.next();
        
        System.out.println("Please enter your credit card number");
        
        String ccn = scan.next();
        
        if(ccn.length()!=16) {
            System.out.println("Invalid credit card number");
        }else {
            firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).replaceAll("\\w", "*");
            surname = surname.substring(0, 1).toUpperCase() + surname.substring(1).replaceAll("\\w", "*");
            ccn = "**** **** ****" + ccn.substring(12);
            
            System.out.println("Name: " + firstName + " " + surname);
            System.out.println("CCN: " + ccn);
            
       
		 */
		
		
		

	}
}
