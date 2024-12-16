/* 
    Lecture note example - Input and Scanner
*/

import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner (System.in);
        System.out.println ("Please enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        
        System.out.println("Type One number: ");
        int num = sc.nextInt();
        System.out.println("Type another number: ");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.println("The sum of the two numbers are: " + (num + num1));
        
        System.out.println("What is your favorite food? ");
        String food = sc.nextLine();
	}
}