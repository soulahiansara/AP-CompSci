/*
 *	Author:  Sara Soulahian
 *  Date: October 14, 2024
*/

import java.util.Scanner;
import java.util.Random;

class character{
	String role = new String("warrior");
	int strength = 6;
	int dexterity = 7;
	int charisma = 2;
	int intelligence = 5;
}

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		character stats = new character();
		System.out.println(stats.strength);
		System.out.println(stats.dexterity);
		System.out.println(stats.charisma);
		System.out.println(stats.intelligence);
		
		


		
	}
}
