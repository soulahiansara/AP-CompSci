/*
 *	Author:  Sara Soulahian
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		toString("hi");
		toStringCombined("hello", "mom");


		
	}
	public static void toString(String something){
		System.out.println(something);
	
	}
	public static void toStringCombined(String one, String two){
		String together = new String(one + two);
		System.out.println(one + " "+ two);
	}
}
