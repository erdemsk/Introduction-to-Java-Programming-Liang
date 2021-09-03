/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.25, 264*/
import java.util.*;
public class ConvertMillisecondsToHoursMinutesAndSeconds {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a long value for milliseconds
        System.out.print("Enter a long value: ");
        long milliseconds = input.nextLong();

        //display the converted value
        System.out.println(convertMillis(milliseconds));
    }

    public static String convertMillis(long millis){

        //obtain the seconds
        long totalSeconds = millis / 1000;
        long currentSecond = totalSeconds % 60;
        String output = ":" + currentSecond;

        //obtain the minutes
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        output = ":" + currentMinute + output;

        //obtain the hours
        long totalHours = totalMinutes / 60;
        output = totalHours + output;

        //return the converted value
        return output;
    }
}
