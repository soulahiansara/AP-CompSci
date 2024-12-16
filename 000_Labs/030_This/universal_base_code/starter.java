/*
 *	Author:  Sara Soulahian
 *  Date: November 1, 2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		int counter = 0;
		PooleDwarf test = new PooleDwarf(randName(), 8);
		PooleDwarf test2 = new PooleDwarf(randName(), 9);
		PooleDwarf test3 = new PooleDwarf(randName(), 4);
		PooleDwarf test4 = new PooleDwarf(randName(), 3);
		PooleDwarf test5 = new PooleDwarf(randName(), 7);
		PooleDwarf test6 = new PooleDwarf(randName(), 1);
		PooleDwarf test7 = new PooleDwarf(randName(), 40);
		
		if(test.isSameName(test2.getName())){
			counter = counter + 1;
		}
		if(test.isSameName(test3.getName())){
			counter = counter + 1;
		}
		if(test.isSameName(test4.getName())){
			counter = counter + 1;
		}
		if(test.isSameName(test5.getName())){
			counter = counter + 1;
		}
		if(test.isSameName(test6.getName())){
			counter = counter + 1;
		}
		if(test.isSameName(test7.getName())){
			counter = counter + 1;
		}
		
		System.out.println("There are " + counter + " amount of duplicates of the name " + test.getName());
		
	}
}
