import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// CVMath.specialSquare(5);
		 //System.out.println(CVMath.findMid(2,3,1));
		Scanner sc = new Scanner(System.in);
		System.out.print("How many special squares would you like? ");
		
		int x = sc.nextInt();
		int counter = 0;
		int num = 0;
		while(counter != x){
			if(CVMath.Square(num) && CVMath.Consecutive(num)){
				System.out.println(num);
				counter++;
			}
			num++;
		}
	}
}
