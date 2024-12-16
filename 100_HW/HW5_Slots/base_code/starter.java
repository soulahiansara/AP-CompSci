/*
 *	Author: Sara Soulahian
 *  Date: October 1, 2024
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the slot machine! You have 100 virtual dollars to gamble on");
		int money = 100;
		String answer;
		
		while (money>0){
			System.out.println("Would you like to play? (Yes / yes / y / Y) (No / no / n / N)");
			answer = sc.nextLine();
			if (answer.equals("Yes")||answer.equals("yes")||answer.equals("y")||answer.equals("Y")){
				System.out.println("How much would you like to wager on? ");
				int wager = sc.nextInt();
				if (wager <= money && wager >= 0){
					money = money - wager;
					int x = (int)(Math.random()*11);
					int y = (int)(Math.random()*11);
					int z = (int)(Math.random()*11);
					System.out.println("-----------------------");
					System.out.println("| " + x + " | " + y + " | " + z + " |");
					if(x==y && y==z){
						money = money + wager*3;
						System.out.println("You hit a jackpot! And you tripled your money!");
					}
					else if(x==y || x==z || y==z){
						money = money + wager*2;
						System.out.println("Two numbers are the same! You doubled your money!");
					}
					else{
						System.out.println("Boo you didn't win anything");
					}
					System.out.println("Here is your balance " + money);
				}
				else if(wager > money || wager <= 0){
					System.out.println("Error: Your wager is too high or too low, try again!");
				}
				
				
				
				
			}
			else if(answer.equals("No")||answer.equals("no")||answer.equals("n")||answer.equals("N")){
				System.out.println("Your final total is "+ money);
				System.out.println("Thank you for playing! Goodbye!");
				break;
			}
			sc.nextLine();
			
			
		}
		if (money<=0){
			System.out.println("You ran out of money, sorry....");
		}
		
	}
}