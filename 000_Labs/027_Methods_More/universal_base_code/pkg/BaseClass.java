/*
 *	Author:  Sara Soulahian
 *  Date: October 22, 2024
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	int example = 0;
	String role;
	int strength;
	int dexterity;
	int charisma;
	int intelligence;
	
	public BaseClass() {
		role = "No role";
		strength = 0;
		dexterity = 0;
		charisma = 0;
		intelligence = 0;
		
	}
	public BaseClass(String r, int s, int d, int c, int i){
		role = r;
		strength = s;
		dexterity = d;
		charisma = c;
		intelligence = i;
	}
	public String setRole(String r){
		if (r != "warrior" && r != "witch" && r != "rouge"){
			r = "No Role";
		}
		role = r;
		return role;
	}
	public int setStrength(int s){
		if (s <= 0){
			s = 0;
		}
		strength = s;
		return strength;
	}
	public int setDexterity(int d){
		if (d <= 0){
			d = 0;
		}
		dexterity = d;
		return dexterity;
	}
	public int setIntelligence(int i){
		if (i <= 0){
			i = 0;
		}
		intelligence = i;
		return intelligence;
	}
	public int setCharisma(int c){
		if (c <= 0){
			c = 0;
		}
		charisma = c;
		return charisma;
	}
	public boolean setAll(String r, int s, int d, int i, int c){
		boolean z = (r.equals("warrior") || r.equals("witch") || r.equals("rouge"));
		boolean y = s > 0;
		boolean x = d > 0;
		boolean w = i > 0;
		boolean v = c > 0;
		
		if (z & y & x & w & v){
			return true;
		}
		
		return false;
	}
	public void myToString(){
		System.out.println(role);
		System.out.println(strength);
		System.out.println(dexterity);
		System.out.println(charisma);
	}

}

