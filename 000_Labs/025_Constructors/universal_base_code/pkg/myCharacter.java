/*
 *	Author:  Sara Soulahian
 *  Date: October 16, 2024
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
	String r;

	public myCharacter() {
		role = "No role";
		strength = 0;
		dexterity = 0;
		charisma = 0;
		intelligence = 0;
		
	}
	public myCharacter(String r){
		role = r;
		strength = 9;
		dexterity = 5;
		charisma = 4;
		intelligence = 7;
	}
	public void character(){
		if (role.equals("warrior")){
			System.out.println("You picked warrior! Here are your stats:");
			System.out.println("Strength is " + strength);
			System.out.println("Dexterity is "+ dexterity);
			System.out.println("Charisma is "+ charisma);
			System.out.println("Intelligence is "+ intelligence);
		}
		else if (role.equals("witch")){
			System.out.println("You picked witch! Here are your stats:");
			System.out.println("Strength is " + strength);
			System.out.println("Dexterity is "+ dexterity);
			System.out.println("Charisma is "+ charisma);
			System.out.println("Intelligence is "+ intelligence);
		}
		else if (role.equals("rouge")){
			System.out.println("You picked rouge! Here are your stats:");
			System.out.println("Strength is " + strength);
			System.out.println("Dexterity is "+ dexterity);
			System.out.println("Charisma is "+ charisma);
			System.out.println("Intelligence is "+ intelligence);
		}
		else {
			System.out.println("You picked no role! Here are your stats:");
			System.out.println("Strength is " + strength);
			System.out.println("Dexterity is "+ dexterity);
			System.out.println("Charisma is "+ charisma);
			System.out.println("Intelligence is "+ intelligence);
		}
	}

}

