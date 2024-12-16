/*
 *	Author: Sara Soulahian
 *  Date: September 22, 2024
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.print("What day is it today? 0 = Sunday, 1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 = Friday, 6 = Saturday ");
		int day = sc.nextInt();
		
		if (day == 1 || day == 2 || day == 3 || day == 4|| day == 5){
			System.out.print("Wake up at 7:00 am");
		}
		else if(day == 0 || day == 6){
			System.out.print("Wake up at 10:00 am");
		}
	}
}
