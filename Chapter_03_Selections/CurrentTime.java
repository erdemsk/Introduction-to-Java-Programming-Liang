/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
3. Programming Exercises 3.30, 138*/
import java.util.*;
public class CurrentTime {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user time zone
        System.out.print("Enter the time zone offset to GMT: ");
        int gmt= input.nextInt();

        if (gmt < -12 || gmt > 12) {
            System.out.println("Enter an integer from -12 to 12");
            System.exit(1);
        }

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
        long currentHours = totalHours % 24;
        long currentHoursInTimeZone = currentHours + (long) gmt;

        //displaying the current time
        if (currentHoursInTimeZone == 12){
            System.out.println("The current time is " + (currentHoursInTimeZone) + ":" + currentMinutes + ":" + currentSeconds + " PM");
        }
        else if (currentHoursInTimeZone == 24){
            System.out.println("The current time is " + (currentHoursInTimeZone - 12) + ":" + currentMinutes + ":" + currentSeconds + " AM");
        }
        else if (currentHoursInTimeZone < 12){
            System.out.println("The current time is " + (currentHoursInTimeZone) + ":" + currentMinutes + ":" + currentSeconds + " AM");
        }
        else {
            System.out.println("The current time is " + (currentHoursInTimeZone - 12) + ":" + currentMinutes + ":" + currentSeconds + " PM");
        }
    }
}
