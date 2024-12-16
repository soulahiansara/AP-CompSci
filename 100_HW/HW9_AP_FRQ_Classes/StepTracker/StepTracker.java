public class StepTracker{
    private int minSteps
    private int activeDays;
    private int days;
    private int totalSteps;
    
    public StepTracker(int steps){
        minSteps = steps;
        activeDays = 0;
        days = 0;
        totalSteps = 0;
    }

    public void addDailySteps(int steps){
        totalSteps+= steps;
        days++;
        if(steps>=minSteps){
            activeDays++;
        }
    }
    public int activeDays(){
        return activeDays;
    }
    
    public double averageSteps(){
        return (double) totalSteps/days;
    }