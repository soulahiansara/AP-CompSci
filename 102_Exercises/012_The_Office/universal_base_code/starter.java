/*
 *	Author: Sara Soulahian
 *  Date: October 22, 2024
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		michael.raiseSalary(7);
		double raise = michael.getAnnualSalary();
		System.out.println("Michela's new salary is "+ raise);
		
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.employeeToString();
		dwight.raiseSalary(10);
		double raise1 = dwight.getAnnualSalary();
		System.out.println("Dwight's new salary is " + raise1);
		
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.employeeToString();
		jim.raiseSalary(13);
		double raise2 = jim.getAnnualSalary();
		System.out.println("Jim's new salary is " + raise2);
		
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250.0);
		pam.employeeToString();
		pam.raiseSalary(11);
		double raise3 = pam.getAnnualSalary();
		System.out.println("Pam's new salary is " + raise3);
		
		Employee tom = new Employee(5930, "Tom", "Crow", 3908.78);
		tom.employeeToString();
		tom.raiseSalary(16);
		double raise4 = tom.getAnnualSalary();
		System.out.println("Tom's new salary is " + raise4);
		
		
	}
}
