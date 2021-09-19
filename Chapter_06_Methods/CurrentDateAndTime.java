/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.33, 266
Inspired from the http://soultionmanual.blogspot.com/2016/08/chapter-6-exercise-33-introduction-to.html
but I didn't just copy and paste it, but tried to improve the source code.
*/
public class CurrentDateAndTime {
    public static void main(String[] args) {
        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = totalHours % 24;

        // Display the result
        System.out.printf("Current date and time is %s %02d:%02d:%02d GMT", getDate(totalHours),
                currentHour, currentMinute, currentSecond);
    }

    public static String getDate(long numberOfHours) {
        // Compute the number of days
        long numberOfDays = 1 + (numberOfHours / 24);
        int startYear = 1970;
        int dayReduction = 0;

        while (numberOfDays > 0) {

            if (isLeapYear(startYear)) {
                dayReduction = 366;
            }

            else {
                dayReduction = 365;
            }
            numberOfDays -= dayReduction;
            startYear++;
        }

        // dial it back the year and the numberOfDays back one notch
        numberOfDays += dayReduction;
        startYear--;

        return getMonthAndDay(numberOfDays, startYear) + " " + startYear;
    }

    public static String getMonthAndDay(long numberOfDays, int year) {
        int dayReduction = 0;
        int month;
        for (month = 1; month <= 12; month++) {
            dayReduction = getNumberOfDaysInMonth(year, month);
            numberOfDays -= dayReduction;

            if (numberOfDays < 0){
                break;
            }
        }

        numberOfDays += dayReduction;
        return  getMonthName(month) + " " + numberOfDays+ ",";
    }

    // Get the number of days in a month
    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
                || month == 10 || month == 12)
            return 31;

        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;

        if (month == 2)
            return isLeapYear(year) ? 29 : 28;

        return 0; // If month is incorrect
    }

    // Determine if it is a leap year
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    // Get the name of the month
    public static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December";
        }

        return monthName;
    }
}
