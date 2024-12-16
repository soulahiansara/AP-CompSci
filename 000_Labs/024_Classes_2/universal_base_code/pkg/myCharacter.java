/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	int example = 0;
	int strength;
	int dexterity;
	int charisma;
	int intelligence; 
	String role;

	public myCharacter(){
		role = "warrior";
		strength = 6;
		dexterity = 7;
		charisma = 2;
		intelligence = 5;
	}
	
	public void stats(){
		System.out.println("Strength is " + strength);
		System.out.println("Dexterity is "+ dexterity);
		System.out.println("Charisma is "+ charisma);
		System.out.println("Intelligence is "+ intelligence);
	}

}

