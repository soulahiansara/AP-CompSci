/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you a wizard, warrior, or rogue? ");
		String x = sc.nextLine();
		
		if((x.equals("Wizard")) || (x.equals("wizard"))){
			System.out.println("You chose the wizard");
		}
		else if((x.equals("Warrior")) || (x.equals("warrior"))){
			System.out.println("You chose the warrior");
		}
		else if ((x.equals("Rogue")) || (x.equals("rouge"))){
			System.out.println("You chose the rogue");
		}
		else{
			System.out.println("You didn't choose a character, try again");
		}
	}
}
