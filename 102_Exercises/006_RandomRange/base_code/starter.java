/*
 *	Author: Sara Soulahian
 *  Date:September 16, 2024
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give a number: ");
		int num = sc.nextInt();
		
		System.out.println("Give a number that is higher than the last one: ");
		int num1 = sc.nextInt();
		
		System.out.println("Your range is " + num + " to " + num1 + ".");
		System.out.println("Here are 5 numbers generated in that range: ");
		
		int y = num1 - num;
	
		System.out.println((int)(Math.random()*y)+num);
		System.out.println((int)(Math.random()*y)+num);
		System.out.println((int)(Math.random()*y)+num);
		System.out.println((int)(Math.random()*y)+num);
		System.out.println((int)(Math.random()*y)+num);
	}
}
