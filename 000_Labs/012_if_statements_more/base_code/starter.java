/*
 *	Author: Sara Soulahian
 *  Date: September 17, 2024
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Type a number: ");
		int num = sc.nextInt();
		
		System.out.print("Type another number: ");
		int num1 = sc.nextInt();
		
		if(num == num1){
			System.out.println(num + " and " + num1 + " are equal to one another");
		}
		else{
			System.out.println(num + " and " + num1 + " are not equal to one another");
		}
	}
}
