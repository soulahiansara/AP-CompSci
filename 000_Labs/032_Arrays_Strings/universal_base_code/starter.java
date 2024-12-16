/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		String [] lyric = new String[10];
		lyric[0] = "Time's moving so much slower lately";
		lyric[1] = "It's like the world's playin' a joke";
		lyric[2] = "Laughing at me for falling foolishly again";
		lyric[3] = "But something's different with you";
		lyric[4] = "Traffic on Sunset doesn't phase me";
		lyric[5] = "I'm just unusually composed";
		lyric[6] = "That is until I touh you and I can't pretend";
		lyric[7] = "I lose myself again, I do";
		lyric[8] = "I'm all in, I'm fallin'";
		lyric[9] = "Can't get back up";
		int x = 0;
		while (x < 10){
			System.out.println(lyric[x]);
			
			x++;
		}

		
	}
}
