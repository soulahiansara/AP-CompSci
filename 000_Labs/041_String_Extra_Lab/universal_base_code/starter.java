/*
 *	Author:  Sara Soulahian
 *  Date: December 6, 2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static String reversed(String phrase){
        String reversedPhrase = "";
        int counter = 0;
        String phraseTest = phrase;
        int space = 0;
        
        while (space != -1) {
            space = phraseTest.indexOf(" ");
            counter++;
            if (space != -1) {
                phraseTest = phraseTest.substring(space + 1);
            }
        }

        String[] arr = new String[counter];

        int previousSpace = -1;
        space = 0;
        counter = 0;

        while ((space = phrase.indexOf(" ", previousSpace + 1)) != -1) {
            arr[counter++] = phrase.substring(previousSpace + 1, space);
            previousSpace = space;
        }
        arr[counter] = phrase.substring(previousSpace + 1); 

       
        for (int i = arr.length - 1; i >= 0; i--) {
            reversedPhrase += arr[i] + " ";
        }

        return reversedPhrase;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write out your phrase: ");
        String phrase = sc.nextLine();
        System.out.println(reversed(phrase));
    }
}
