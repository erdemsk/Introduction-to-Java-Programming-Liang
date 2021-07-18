/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 2.12 Case Study: Displaying the Current Time, 74*/

public class ShowCurrentTime {
    public static void main(String[] args) {
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

        //displaying the current time
        System.out.println("Current time is: "+currentHours+":"+currentMinutes+":"+currentSeconds+" GMT");
    }
}
