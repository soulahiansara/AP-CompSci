/*
 *	Author:  Sara Soulahian
 *  Date: November 15, 2024
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Warrior [] warriors = new Warrior[100];
		Wizard [] wizards = new Wizard[100];
		int warCount = 0;
		int wizCount = 0;
		
		for(int x = 0; x < warriors.length; x++){
			warriors[x] = new Warrior();
		}
		
		for(int x = 0; x < wizards.length; x++){
			wizards[x] = new Wizard();
		}
		
		while(wizCount <= 99 || warCount <= 99){
			warriors[warCount].attack(wizards[wizCount]);
			if(wizards[wizCount].isDead()){
				wizCount++;
			}
			
			if (wizCount >= 99){
				break;
			}
			
			wizards[wizCount].attack(warriors[warCount]);
			if(warriors[warCount].isDead()){
				warCount++;
			}
			
			if (warCount >= 99){
				break;
			}
		}
		
		if(warCount == 99){
			System.out.print("Wizards have won! Wizards had " + (100-wizCount) + " wizards left.");
		}
		
		if(wizCount == 99){
			System.out.print("Warriors have won! Warriors had " + (100-warCount) + " warriors left.");
		}
	}
}
