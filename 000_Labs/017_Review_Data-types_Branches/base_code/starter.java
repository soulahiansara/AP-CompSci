/*
 *	Author:  Sara Soulahian
 *  Date: September 26, 2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is you characters name? ");
		String name = sc.nextLine();
		
		System.out.println("What is your characters title? Ex: Slayer of Dragons, etc.");
		String title = sc.nextLine();
		
		System.out.println("Are you a wizard, warrior, or rogue? ");
		String x = sc.nextLine();
		
		if((x.equals("Wizard")) || (x.equals("wizard"))){
			System.out.println("You chose the wizard");
		}
		else if((x.equals("Warrior")) || (x.equals("warrior"))){
			System.out.println("You chose the warrior");
		}
		else if ((x.equals("Rogue")) || (x.equals("rogue"))){
			System.out.println("You chose the rogue");
		}
		else{
			System.out.println("You didn't choose a character, try again");
			System.out.println("Are you a wizard, warrior, or rogue? ");
			x = sc.nextLine();
		}
		
		System.out.println("You have 20 skill points to spend! What will you spend them on?");
		System.out.println("Strength - Buff and be able to carry items");
		System.out.println("Dexterity - Agile and moves quick");
		System.out.println("Intelligence - Better at magic spells");
		System.out.println("Charisma - How personable");
		System.out.println("You can only have a maximum of 10 skill points for each skill");
		
		int points = 20;
		
		System.out.println("How many of your 20 points would you like to spend on strength? ");
		int strength = sc.nextInt();
		if (strength>10){
			System.out.println("Value is too high, try again");
			System.out.println("You can only spend a maximum of 10 points in each skill");
			System.out.println("How many of your 20 points would you like to spend on strength? ");
			strength = sc.nextInt();
			points = points - strength;
			System.out.println("You spent " + strength + " points on strength!");
			System.out.println("You have " + points + " points left to spend");
		}
		else if (strength<=10){
			points = points - strength;
			System.out.println("You spent " + strength + " points on strength!");
			System.out.println("You have " + points + " points left to spend");
		}
		
		System.out.println("How many of your points would you like to spend on dexterity? ");
		int dexterity = sc.nextInt();
		
		if (dexterity>10){
			System.out.println("Value is too high, try again");
			System.out.println("You can only spend a maximum of 10 points in each skill");
			System.out.println("How many of your points would you like to spend on dexterity? ");
			dexterity = sc.nextInt();
			points = points - dexterity;
			System.out.println("You spent " + dexterity + " points on dexterity!");
			System.out.println("You have " + points + " points left to spend");
		}
		else if (dexterity<=10){
			points = points - dexterity;
			System.out.println("You spent " + dexterity + " points on dexterity!");
			System.out.println("You have " + points + " points left to spend");
		}
		if (points == 0){
			System.out.println("You have finished your 20 skill points!");
		}
		
		System.out.println("How many points would you like to spend on intelligence? ");
		int intelligence = sc.nextInt();
		if (intelligence>10){
			System.out.println("Value is too high, try again");
			System.out.println("You can only spend a maximum of 10 points in each skill");
			System.out.println("How many of your points would you like to spend on intelligence? ");
			intelligence = sc.nextInt();
			points = points - intelligence;
			System.out.println("You spent " + intelligence + " points on dexterity!");
			System.out.println("You have " + points + " points left to spend");
		}
		else if (intelligence <=10){
			points = points - intelligence;
			System.out.println("You spent " + intelligence + " points on dexterity!");
			System.out.println("You have " + points + " points left to spend");
		}
		if (points == 0){
			System.out.println("You have finished your 20 skill points!");
		}
	
		System.out.println("How many points would you like to spend on charisma? ");
		int charisma = sc.nextInt();
		if (charisma>10){
			System.out.println("Value is too high, try again");
			System.out.println("You can only spend a maximum of 10 points in each skill");
			System.out.println("How many of your points would you like to spend on charisma? ");
			charisma = sc.nextInt();
			points = points - charisma;
			System.out.println("You spent " + charisma + " points on dexterity!");
			System.out.println("You have " + points + " points left to spend");
		}
		else if (charisma <=10){
			points = points - charisma;
			System.out.println("You spent " + charisma + " points on dexterity!");
			System.out.println("You have " + points + " points left to spend");
		}
		if (points == 0){
			System.out.println("You have finished your 20 skill points!");
			
			System.out.println("Your characters name is " + name);
			System.out.println("Your characters title is " + title);
			System.out.println("Your role is " + x);
			
			System.out.println("Your stats are: ");
			System.out.println("Strength = " + strength + " points");
			System.out.println("Dexterity = " + dexterity + " points");
			System.out.println("Intelligence = " + intelligence + " points");
			System.out.println("Charisma = "+ charisma + " points" );
		}
		
	}
}
