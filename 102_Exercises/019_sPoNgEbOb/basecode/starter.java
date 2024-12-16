/*
	Author: Sara Soulahian
	Date:December 5, 2024
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Type in a word or phrase: ");
		String sarcasm = sc.nextLine();
		String finalSent = "";
		while(true){
			if(sarcasm.indexOf(" ") == -1){
				finalSent = finalSent + " " + spongeCase(sarcasm);
				break;
			}
			int space = sarcasm.indexOf(" ");
			String word = sarcasm.substring(0, space);
			
			finalSent = finalSent + " " + spongeCase(word);
			sarcasm = sarcasm.substring(space+1);
		}
		System.out.println(finalSent);
	/*	String result = "";
		for(int i = 0; i < sarcasm.length(); i++){
			String letter = sarcasm.substring(i, i+1);
			if(i%2 == 0){
				letter = letter.toLowerCase();
			}
			else{
				letter = letter.toUpperCase();
			}
			
			result = result + letter;
		}
		
		System.out.print(result);
	*/	

	}
	
	public static String spongeCase(String word){
		String result = "";
		for(int i = 0; i < word.length(); i++){
			String letter = word.substring(i, i+1);
			if(i%2 == 0){
				letter = letter.toLowerCase();
			}
			else{
				letter = letter.toUpperCase();
			}
			
			result = result + letter;
		}
		return result;
	}
	
}
