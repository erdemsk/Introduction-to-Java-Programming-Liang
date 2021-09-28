/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.34, 267
Inspired from the http://soultionmanual.blogspot.com/2016/08/chapter-6-exercise-34-introduction-to.html
but I didn't just copy and paste it, but tried to improve the source code.
*/
import java.util.Scanner;
public class PrintCalendarRewrite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter the year
        System.out.print("Enter a year (e.g., 2001): ");
        int year = input.nextInt();

        //Prompt the user to enter the month
        System.out.print("Enter the month as a number between 1 and 12: ");
        int month = input.nextInt();

        //Print the calendar for the month of the year
        printMonth(year, month);
    }

    //Print the calendar for a month in a year
    public static void printMonth(int year, int month) {
        //Print the headings of the calendar
        printMonthTitle(year, month);

        //Print the body of the calendar
        printMonthBody(year, month);
    }

    // Print the month title, e.g., May, 1999
    public static void printMonthTitle(int year, int month) {
        System.out.println("         " + getMonthName(month) + " " + year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    // Get the name of the month
    public static String getMonthName(int month) {
        String monthName;
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "";
        }

        return monthName;
    }

    // Print the month body
    public static void printMonthBody(int year, int month) {
        // Get the start day of the week for the first date in the month
        int startDay = getStartDay(year, month);

        // Get the number of days in the month
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

        // Pad space before the first day of the month
        for (int i = 0; i < startDay; i++)
            System.out.print("    ");

        for (int i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d", i);

            if ((i + startDay) % 7 == 0)
                System.out.println();
        }

        System.out.println();
    }

    // Get the start day of month/1/year
    public static int getStartDay(int year, int month) {

        int y = year;
        int m = month;
        int q = 1;

        // to handle January and February
        if (m == 1 || m == 2) {
            m = m + 12;
            y = y - 1;
        }

        int j = y / 100;
        int k = y % 100;
        int h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;

        switch (h) {
            case 0:
                h = 6;
                break;
            case 1:
                h = 7;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                h--;
        }
        return h;
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
}