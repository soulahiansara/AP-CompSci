/*
 *	Author:  Sara Soulahian
 *  Date: October 8, 2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here

		
		int power = pow(4,2);
		System.out.print(power);

		
	}
	public static int pow(int x, int y){
		int a = 1;
		while (y>0){
			a = a * x;
			y = y-1;
		}
		return a;
		
	}
}
