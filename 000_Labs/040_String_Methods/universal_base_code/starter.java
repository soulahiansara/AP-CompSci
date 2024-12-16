/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		System.out.print("Write out your full name: ");
		String fullName = sc.nextLine();
		
		int space = fullName.indexOf(" ");
		String lastName = fullName.substring(space + 1);
		System.out.println("Last Name: " + lastName);


		
	}
}
