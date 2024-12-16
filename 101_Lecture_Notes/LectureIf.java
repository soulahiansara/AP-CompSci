/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        boolean x = true;
        boolean y = false;
        
        These are the only values a boolean can store.
        Beyond that, we can store Expressions!
        These act as answers to Yes/No questions.
        
        boolean z = 5 > 3; //What values does z store? 
        boolean a = 3 < 4; // less than
        boolean b = 4 == 4; // equal to
        boolean c = 4 != 5; //not equal to
        boolean d = 3 <= 3; // less than or equal to 
        boolean e = 5 <= 8; // greater than or equal to
        
        These are all the expressions we can use for Primitive Data only
        
        Above we compare JUST integers.
        boolean f = 5.5 != 6.5
        boolean g = true == false;
        
        We can not use these to compare Strings
        
        FOR STRINGS
        NEW METHOD
        
        .equals()
        boolean h = ("hello").equals("hello");
        
        Strings must use the .equals method to compare
        This does a letter by letter comparison till finished or different 
        
        That's it for booleans
        They store True or Flase
        
        int // yes primative
        string // no not primative
        Primative Data 
        These are foundational blocks of data (lower case data) int, double, boolean, char, float, long, etc
        
        String is NOT primative because it is made up of char's 
        
        'h' + 'e' + 'l' + 'l' + 'o' -> This is equal to "hello"
        
        IF STATEMENTS
        We can start to CHOOSE our own adventure! Like a 
        
        if(5>3){//<- here we can place a question or answer
           //IF THE CONDITION ABOVE IS TRUE 
            //THEN THIS CODE RUNS
            System.out.print("This runs!"); 
        }
        
        if (a){ 
           //Try running your code using the booleans above 
           System.out.print("This runs too!");
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Numba please");
        int num = sc.nextInt();
        
        if (num > 10){
            System.out.println("Your numba bigger than 10");
        }
        else{
            //This Else Catches Everything Else
           // THIS CATCHES GREATER THAN OR EQUAL TO 10
           System.out.println("Your value isn't greater than 10");
        }
	}
}