/*
 *	Author:  Sara Soulahian
 *  Date: November 5, 2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		int value;
		int sum = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int arraySize = (int)(Math.random()*149 + 51);
		int[] arr = new int[arraySize];
		//assigns value
		for(int x = 0; x<arraySize; x++){
			value = (int)(Math.random()*100);
			arr[x] = value;
			x++;
		}	
		//finds minimum and maximum
		for(int x = 0; x<arr.length; x++){
			if(arr[x] < min){
				min = arr[x];
				//System.out.print("New Minimum" + min + "\n");
			}
			else if(arr[x] > max){
				max = arr[x];
			}
			
			
		}
		
		//finds total for average
		for(int x = 0; x<arr.length; x++){
			sum+=arr[x];
		}
		
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		System.out.println("Average: " + (sum/arr.length));
		
	}
}
