/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pick your role: warrior / witch / rouge / no role");
		String r = sc.nextLine();
		
		
		if ((r.equals("warrior")) || (r.equals("witch")) || (r.equals("rouge"))){
			myCharacter game = new myCharacter(r);
			game.myToString();
		}
		else{
			myCharacter game = new myCharacter();
			game.myToString();
		}


		
	}
}
