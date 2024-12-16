/*
 *	Author:  Sara Soulahian
 *  Date: November 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int value = 0;
		int [] arr = new int[100];
		for(int i = 0; i < arr.length; i++){
			value = (int)(Math.random()*100+1);
			arr[i] = value;
		}
		
		toStringArray(arr);
		getArrayAverage(arr);
		getArrayMax(arr);
		getArrayMin(arr);
		
	}
		
	public static void toStringArray(int [] x){
		for(int i = 0; i < x.length; i++){
			System.out.print(x[i] + " , ");
		}
	}
	
	public static int getArrayAverage(int [] x){
		int average = 0;
		int sum = 0;
		for (int i=0; i<x.length; i++){
			sum = sum + x[i];
		}
		average = sum/x.length;
		return average;
	}
	
	public static int getArrayMax(int [] x){
		int max = x[0];
		for(int i = 0; i < x.length; i++){
			if (x[i] > max){
				max = x[i];
			}
		}
		return max;
	}
	
	public static int getArrayMin(int [] x){
		int min = x[0];
		for (int i = 0; i < x.length; i++){
			if (x[i] < min){
				min = x[i];
			}
		}
		return min;
	}
	
}
