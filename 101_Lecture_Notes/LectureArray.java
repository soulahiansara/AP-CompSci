/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        // Your Code Goes here!
        int [] arr = {5, 5, 7, 8, 8, 8, 3, 3};
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        int dupeCheck = 8;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == dupeCheck){
                System.out.println("Found a duplicate");
                System.out.println("Index: " + i);
            }
        }
        
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] - arr[i+1] == 3){
                System.out.println("Consecutive at " + i + " and " + i+1);
            }
        }
        
        arr = {3, 4, 2, 7, 8, 0, 2, 3, -1, 2};
        //finding minimum value
        int min = arr.[0];
        for (int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        //finding maximum value
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        
	}
}