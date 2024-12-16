/*
 *	Author:  Sara Soulahian
 *  Date: November 21, 2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("So what is your pet peeve? ");
		String peeve = sc.nextLine();
		
		System.out.println("Seriously??");
		System.out.println("I can't believe you get annoyed by \"" + peeve + "\". That is ridiculous");
		System.out.println("Whatever, what about your favorite color? ");
		String color = sc.nextLine();
		
		System.out.println(" Yeah, no... \n that is the nastiest color out of all the colors");
		System.out.println("\"" + color + "\" is the grossest color ever.... \t nasty");
		System.out.println("--------------------------------------");
		
		System.out.println("I'll give you one last chance....even though it is against my rule....");
		System.out.println("What is your favortite subject in school?");
		String school = sc.nextLine();
		
		System.out.println("And that is where we finish this conversation. No one's favortive class is \"" + school + "\"");
		System.out.println("See you never...");


		
	}
}
