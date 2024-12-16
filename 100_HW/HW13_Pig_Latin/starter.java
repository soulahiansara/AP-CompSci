/*
   * Author:Sara Soulahian
   * Date:December 8, 2024
   * Collaborator(s):
*/
import java.util.*;
class starter {
	public static String toPigLatin(String word) {
        
        String vowels = "aeiouAEIOU";
        
        if (vowels.indexOf(word.substring(0, 1)) != -1) {
            return word + "way";
        }
        else {
            int firstVowelIndex = -1;
            for (int i = 0; i < word.length(); i++) {
                if (vowels.indexOf(word.substring(i, i+1)) != -1) {
                    firstVowelIndex = i;
                    break;
                }
            }
            if (firstVowelIndex == -1) {
                return word + "ay";
            }
			
            String consonantCluster = word.substring(0, firstVowelIndex);
            String restOfWord = word.substring(firstVowelIndex);
            return restOfWord + consonantCluster + "ay";
        }
    }

    public static String sentenceToPigLatin(String sentence) {
        StringBuilder pigLatinSentence = new StringBuilder();
        int start = 0; 
		
        for (int i = 0; i <= sentence.length(); i++) {
            if (i == sentence.length() || sentence.substring(i, i+1).equals(" ")) {
                String word = sentence.substring(start, i);
                
                if (word.length() > 0) { 
                    pigLatinSentence.append(toPigLatin(word)).append(" ");
                }
                
                start = i + 1;
            }
        }
        if (pigLatinSentence.length() > 0 && pigLatinSentence.substring(pigLatinSentence.length() - 1).equals(" ")) {
            pigLatinSentence.delete(pigLatinSentence.length() - 1, pigLatinSentence.length());
        }
        return pigLatinSentence.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence in English: ");
        String sentence = sc.nextLine();
        String pigLatinSentence = sentenceToPigLatin(sentence);
        System.out.println("Translation: " + pigLatinSentence);
    }
}
