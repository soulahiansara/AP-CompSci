/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	int example = 0;
	int [] x;
	int average = 0;
	int sum = 0;
	int max = x[0];
	int min = x[0];

	public BaseClass() {
		int [] x = new int[0];
		
	}
	
	public void toStringArray(int [] x){
		for(int i = 0; i < x.length; i++){
			System.out.println(x[i] + " , ");
		}
	}
	
	public int getArrayAverage(int [] x){
		for (int i=0; i<x.length; i++){
			sum = sum + x[i];
		}
		average = sum/x.length;
		return average;
	}
	
	public int getArrayMax(int [] x){
		for(int i = 0; i < x.length; i++){
			if (x[i] > max){
				max = x[i];
			}
		}
	}
	
	public int getArrayMin(int [] x){
		for (int i = 0; i < x.length; i++){
			if (x[i] < min){
				min = x[i];
			}
		}
	}

}

