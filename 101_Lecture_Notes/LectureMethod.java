/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        // Your Code Goes here!
        
        greeting("Bob");
        greeting("Jessica");
        greeting("Mary");
        greeting("Julie");
        
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        
        double pay = raiseSalary(1000.42, 14);
        System.out.println(pay);
        
        pay = raiseSalary(pay, 5);
        System.out.println(pay);
	}
	
	public static void greeting(String name){
	    System.out.println("Hello " + name);
	}
	
	public static double raiseSalary(double salary, int percent){
	    double raisedSalary = salary + (salary * (percent/100.0));
	    return raisedSalary;
	}
	
	public static void printAnimal(){
	    System.out.println("   |\\__/,|   (`\\ ");
        System.out.println(" _.|o o  |_   ) )");
        System.out.println("-(((---(((--------)");
	}
}