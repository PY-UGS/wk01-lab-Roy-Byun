package Week_2;

public class Lab02Q3 {
    public static void main(String[] args){
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long Currentseconds = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long CurrentMinutes = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long CurrentHours = totalHours % 24;

        System.out.println("Current time is " + CurrentHours +":" + CurrentMinutes + ":" + Currentseconds + " GMT");
    }
}
