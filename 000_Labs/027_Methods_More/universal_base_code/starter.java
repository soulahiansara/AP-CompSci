/*
 *	Author:  Sara Soulahian
 *  Date: October 22, 2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass character = new BaseClass();
		character.setRole("witch");
		character.setStrength(5);
		character.setDexterity(0);
		character.setIntelligence(7);
		character.setCharisma(0);
		
		character.setAll("witch", 3, 4, 5, 6);
		boolean check = character.setAll("witch", 3, 4, 5, 6);
		System.out.print(check);
		System.out.println();
		character.myToString();
		
		
		
		
		
		
	}
}
