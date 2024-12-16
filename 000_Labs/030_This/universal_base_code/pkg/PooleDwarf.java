/*
 *	Author:  Sara Soulahian
 *  Date: November 1, 2024
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class PooleDwarf {
	private String name;
	private int age;

	public PooleDwarf() {		// Default Constructor
		name = new String("");
		age = 0;
	}

	public PooleDwarf(String name, int age){
		// Complete this constructor
		this.name = name;
		this.age = age;
	}

	/*	Accessor Methods */
	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	/*	Mutator Methods	*/
	public void setName(String name){
		// Fix this method
		this.name = name;
	}
	
	public void setAge(int age){
		// Fix this method
		this.age = age;
	}

	public boolean isSameName(String name){
		// Complete this method
		if(this.name.equals(name)){
			return true;
		}
		else{
			return false;
		}

	}
}

