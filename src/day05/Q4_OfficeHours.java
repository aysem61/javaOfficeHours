package day05;

import java.util.Scanner;

public class Q4_OfficeHours {

	public static void main(String[] args) {
		/*
		 * * Write a program Ask user to create a password it should have at least 1
		 * Special char "!@#$%^&*()_+" 1 Uppercase letter "A" 1 Lower case letter "a" 1
		 * Digit "0123456789" The minimum length of the password should be 8 If
		 * everything is OK, print message as "Password creation successful!"
		 */
		Scanner s = new Scanner(System.in);

		System.out.println("Please enter a password ");
		String pass = s.nextLine().replace(" ", "");

		createPassword(pass);
	}

	private static void createPassword(String pass) {

		char arr[] = pass.toCharArray();

		for (int i = 0; i < arr.length; i++) {

			if (pass.length() >= 8) {

				if ((arr[i] >= 'A' && arr[i] <= 'Z') && (arr[i] >= 'a' && arr[i] <= 'z')  && ( arr[i]>=0 && arr[i]<=9 ) &&( arr[i]>=33 && arr[i]<=47)) {

					System.out.println("Password creation is successfull!");
				}else {
					System.out.println("Your password is not eligible for the system , please try again !");
				}

			}else {
				System.out.println(" your password is to low ! ");
			}
		}

	}

}
