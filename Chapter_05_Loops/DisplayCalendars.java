/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.28, 221
Learned how to solve via:
http://soultionmanual.blogspot.com/2016/08/chapter-5-exercise-29-introduction-to.html
I did not just copy and paste, but rather tried to improve the source code.
*/
import java.util.*;
public class DisplayCalendars {
    public static void main(String[] args) {
        final int LENGTH_OF_LINE = 34;
        String month;

        Scanner input = new Scanner(System.in);
        // Ask the user to enter a year
        System.out.print("Enter year: ");
        int year = input.nextInt();
        //Ask the user to enter the first day of the year
        System.out.print("(0) Sunday, (1) Monday (2) Tuesday (3) Wednesday (4) Thursday\n" +
                "(5) Friday (6) Saturday\n" +
                "Enter the first day of the year: ");
        int day = input.nextInt();

        //Iterate through the months
        for (int monthsOfTheYear = 1; monthsOfTheYear <= 12; monthsOfTheYear++) {
            switch (monthsOfTheYear) {
                case 1:
                    month = "January";
                    break;
                case 2:
                    month = "February";
                    break;
                case 3:
                    month = "March";
                    break;
                case 4:
                    month = "April";
                    break;
                case 5:
                    month = "May";
                    break;
                case 6:
                    month = "June";
                    break;
                case 7:
                    month = "July";
                    break;
                case 8:
                    month = "August";
                    break;
                case 9:
                    month = "September";
                    break;
                case 10:
                    month = "October";
                    break;
                case 11:
                    month = "November";
                    break;
                case 12:
                    month = "December";
                    break;
                default:
                    month = "";
            }

            // Print the heading
            // Spaces are calculated from the length of the month string to make it center. 34 is the line length
            System.out.printf("%" + (LENGTH_OF_LINE + month.length()) / 2 + "s %s\n",
                    month, year);
            System.out.println(String.format("%39S", "").replace(' ', '-'));
            System.out.printf("%-6s%-6s%-6s%-6s%-6s%-6s%-6s\n", "Sun", "Mon",
                    "Tue", "Wed", "Thu", "Fri", "Sat");

            // calculating number of days
            int length = 30 + ((monthsOfTheYear + (int) (monthsOfTheYear / 8.0)) % 2);
            if (monthsOfTheYear == 2) {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    length = 29;
                } else {
                    length = 28;
                }
            }
            day = (day) % 7;

            // Calculating day
            // Print spaces before the 1st day of each month
            if (day != 0) {
                System.out.printf("%" + 6 * day + "s", "");
            }

            //Loop through to print the date
            for (int i = 1; i <= length; i++) {
                System.out.printf("%-6d", i);

                //move to the new line after Saturday
                if (day % 7 == 6) {
                    System.out.println();
                }
                day += 1;
            }
            //move to the new line at the end of each month
            System.out.println();
        }
        }
    }

