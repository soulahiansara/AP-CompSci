package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three) //2, 3, 1
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	
	public static boolean Square(int square){
		int num = (int) (Math.sqrt(square));
		if(num*num == square){
			return true;
		}
		return false;
	}
	
	public static boolean Consecutive(int num){
		int sum = 0;
		for(int i = 1; sum < num; i++){
			sum = sum + i;
			if(sum == num){
				return true;
			}
		}
		return false;
	}
	
}
