/*
 *	Author:  Sara Soulahian
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		int [] arr = new int[1000];
		
		for(int x = 0; x < 1000; x++){
			int a = (int)(Math.random()*1000);
			arr[x] = a;
			System.out.print(x + " ");
			System.out.println(arr[x]);
			x++;
		}
		
		
	}
}
