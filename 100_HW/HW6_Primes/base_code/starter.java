/*
 *	Author:Sara Soulahian
 *  Date:October 8, 2024
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Enter a number: ");
		int y = sc.nextInt();
		printPrimes(y);
		boolean b = checkPrime(y);
		if (b == false){
			System.out.println("Your number is not a prime number");
		}
		else if (b == true){
			System.out.println("Your number is a prime number");
		}
	}
	public static boolean checkPrime(int x){
		int a = x-1;
		boolean b = true;
		while (a > 1){
			if (x%a != 0){
				a = a-1;
			}
			else if (x%a == 0){
				b = false;
				return b;
			}
		}
		return b;
	}
	public static void printPrimes(int y){
		int number = 2;
		while (number < y){
			if (checkPrime(number)){
				System.out.println(number);
			}
			number++;
		}
	}
}
