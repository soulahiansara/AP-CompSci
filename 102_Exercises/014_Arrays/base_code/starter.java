/*
 *	Author: Sara Soulahian
 *  Date: November 5, 2024
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] arr = new int[1001];
		 int i = 0;
		 int a = 0;
		 while (i < 1001){
			a = a + 3;
		 	arr[i] = a;
			System.out.print(i + " ");
		 	System.out.println(arr[i]);
		 	i++;
		 }
		 System.out.println("");
		 System.out.println("--------------------------------------");
		 System.out.println("");
		 
		 int [] arr1 = new int[1001];
		 int x = 0;
		 int y = 1000;
		 while (x<1001){
		 	arr1[x] = y;
		 	y = y -1;
		 	System.out.print(x + " ");
		 	System.out.println(arr1[x]);
		 	x++;
		 }
	}
}
