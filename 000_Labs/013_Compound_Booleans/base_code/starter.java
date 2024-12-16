/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Type a number: ");
		int x = sc.nextInt();
		
		System.out.print("Type another number: ");
		int y = sc.nextInt();
		
		System.out.print("Type one last number: ");
		int z = sc.nextInt();
		
		if ((x > y) && (x > z)){
			System.out.println(x + " is the biggest number");
		}
		else if ((y > x) && (y > z)){
			System.out.println(y + " is the biggest number");
		}
		else if ((z > x) && (z > y)){
			System.out.println(z + " is the biggest number");
		}
		
		if ((x < y) && (x < z)){
			System.out.println(x + " is the smallest number");
		}
		else if ((y < x) && (y < z)){
			System.out.println(y + " is the smallest number");
		}
		else if ((z < x) && (z < y)){
			System.out.println(z + " is the smallest number");
		}
		
		
	}
}
