/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 2. Programming Exercises 2.8, 92*/
import java.util.*;
public class CurrentTime {
    public static void main(String[] args) {
        //creating a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user the time zone
        System.out.print("Enter the time zone offset to GMT: ");
        int gmt= input.nextInt();

        // obtaining the total milliseconds since 1 January 1970 (search for UNIX epoch)
        long totalMilliSeconds = System.currentTimeMillis();

        // converting milliseconds to seconds
        long totalSeconds= totalMilliSeconds/1000;

        // computing the current second in the minute in the hour
        long currentSeconds= totalSeconds%60;

        // obtaining the total minutes since 1 January 1970
        long totalMinutes = totalSeconds/60;

        // computing the current minute in the hour
        long currentMinutes = totalMinutes%60;

        // obtaining the total hours since 1 January 1970
        long totalHours= totalMinutes/60;

        // computing the current hour inside of the current day
        long currentHours= totalHours%24;
        long currentHoursInTimeZone=currentHours+ (long) gmt;
        //displaying the current time
        System.out.println("The current time is: "+currentHoursInTimeZone+":"+currentMinutes+":"+currentSeconds);
    }
}
