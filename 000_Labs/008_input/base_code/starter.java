/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First name: ");
		String first = sc.nextLine();
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter your birthday month: ");
		String month = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Enter your birthday day: ");
		int day = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter your birthday year: ");
		int year = sc.nextInt();
		sc.nextLine();
		
		System.out.println("How much is a buck fifty? ");
		double money = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Your name is " + first + " and you are " + age + " years old. You were born on " + month + " " + day + ", " + year + " and a buck fifty is " + money);
		
	}
}
