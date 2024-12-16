/*
 *	Author:  Sara Soulahian
 *  Date: October 1, 2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the guessing game. Guess a number: ");
		int num = sc.nextInt();
		
		int x = (int) (Math.random()*1000);
		
		while (true){
			if (x != num){
				System.out.println("Incorrect, guess again! ");
				num = sc.nextInt();
			}
			
			if (x == num){
				System.out.println("Correct! The number was " + x);
				break;
			}
		}
		
	}
}
