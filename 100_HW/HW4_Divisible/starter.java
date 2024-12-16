/*
 *	Author: Sara Soulahian
 *  Date:September 26, 2024
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter a number: ");
		int num = sc.nextInt();
		
		System.out.print("Please enter another number: ");
		int num1 = sc.nextInt();
		
		if ((num % 2) == 0){
			System.out.println(num + " is an even number");
		}
		else if ((num%2) != 0){
			System.out.println(num + " is an odd number");
		}
		
		if ((num1%2) == 0){
			System.out.println(num1+ " is an even number");
		}
		else if ((num1%2) != 0){
			System.out.println(num1 + " is an odd number");
		}
		
		if (((num%3) == 0) && ((num%4) == 0) && ((num%5) == 0)){
			System.out.println(num + " is divisible by 3, 4, and 5!");
		}
		else{
			System.out.println(num + " is not divisible by 3, 4, and 5");
		}
		
		if (((num1%3) == 0) && ((num1%4) == 0) && ((num1%5) == 0)){
			System.out.println(num1 + " is divisible by 3, 4, and 5!");
		}
		else{
			System.out.println(num1 + " is not divisible by 3, 4, and 5");
		}
	}
}
