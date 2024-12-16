/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = ((int)(Math.random()*999)+1);
		
		System.out.println("Welcome to the number guessing game: ");
		System.out.println("Guess a number between 1 to 1000");
		int num = sc.nextInt();
		
		if (x == num){
			System.out.println("You guess correctly! Congrats!");
		}
		else{
			System.out.println("Sorry that wasn't the right answer");
		}
	}
}
