/*
 *	Author: Sara Soulahian
 *  Date: October 27, 2024
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog firstDog = new Dog("buddy");
		firstDog.setAge(4);
		
		Dog secondDog = new Dog("vito", "maltese");
		
		if(firstDog.isSleeping()){
			System.out.println(firstDog.getName() + " is sleeping, shhh");
		}
		else{
			firstDog.bark();
		}
		
		if (secondDog.isSleeping()){
			secondDog.bark();
		}
		else{
			secondDog.bark();
		}



	}
}
