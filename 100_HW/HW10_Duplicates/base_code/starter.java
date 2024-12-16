/*
 *	Author: Sara Soulahian
 *  Date: November 10, 2024
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int value;
		int target;
		int num = 0;
		int[] arr = new int[20];
		//assigns value
		for(int x = 0; x<arr.length; x++){
			value = (int)(Math.random()*10+1);
			arr[x] = value;
		}	
		target = (int)(Math.random()*10 + 1);
		System.out.println("Our target number is " + target);
		
		for(int x = 0; x<arr.length; x++){
			if(arr[x] == target){
				System.out.println("Index: " + x);
				num++;
			}
		}
		System.out.println("Number of duplicates: " + num);
		
		for(int x = 1; x < arr.length; x++){
			if(arr[x-1] == arr[x]){
				System.out.println("Two consecutive numbers in a row have been found!");
				System.out.println("Index: " + (x-1) + " "+ x + " Value: " + arr[x]);
			}
			
		}
	}
}
