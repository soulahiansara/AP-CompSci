import java.util.*;

public class RunningAverage{
    /** The number of ratings included in the running average. */
    private int count;

    /** The average of the ratings that have been entered. */
    private double average;

    // There are no other instance variables.

    /** Creates a RunningAverage object.
    * Postcondition: count is initialized to 0 and average is
    * initialized to 0.0.
    */
    public RunningAverage(){
        /* implementation not shown */
    }

    /** Updates the running average to reflect the entry of a new
    * rating, as described in part (a).
    */
    public void updateAverage(double newVal){
        /* to be implemented in part (a) */
        double total = count * average;
        total += newVal;
        count++;
        average = total/count;
    }


    /** Processes num new ratings by considering them for inclusion
    * in the running average and updating the running average as
    * necessary. Returns an integer that represents the number of
    * invalid ratings, as described in part (b).
    * Precondition: num > 0
    */
    public int processNewRatings(int num){
        /* to be implemented in part (b) */
        int returnVal = 0;
        double rating;
        int success =0;
        int fail=0;
        for(int i = 0; i<num; i++){
            rating = getNewRating();
            if(rating>=0){
                updateAverage(rating);
            }
            else{
                fail++;
            }
            
        }
        if(success >0 && fail>0){
            returnVal = 2;
        }
        else if(fail>0){
            returnVal = 1;
        }
        else{
            returnVal = 0;
        }
        return returnVal;
    }

    /** Returns a single numeric rating. */
    public double getNewRating(){
        /* implementation not shown */
    }
}
