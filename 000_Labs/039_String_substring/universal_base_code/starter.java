/*
 *	Author: Sara SOulahian 
 *  Date: November 21, 2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("Type any word");
		String word = sc.nextLine();
		
		for(int i = 0; i < word.length(); i++){
			System.out.println(word.substring(i , i+1));
		}
		
	}
}
