/*
 *	Author:  Sara Soulahian
 *  Date: October 1, 2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Type out your name: ");
		String name = sc.nextLine();
		
		System.out.print("How many time would you like your name to be printed out? ");
		int num = sc.nextInt();
		
		int a = 0;
		
		while (a < num){
			System.out.println(name);
			
			a = a + 1;
		}



		
	}
}
