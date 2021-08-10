/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.28, 221*/
import java.util.*;
public class DisplayTheFirstDayOfEachMonth {
    public static void main(String[] args) {
        final int NUMBER_OF_MONTHS = 12;

        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter the year, and the first day of the year
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.print("Enter the first day of the year\n(0) Sunday, (1) Monday (2) Tuesday (3) Wednesday " +
                "(4) Thursday (5) Friday (6) Saturday: ");
        int firstDayOfTheYear = input.nextInt();

        //declare string variables for the days and months
        String firstDay = "";
        String month = "";

        //create a boolean variable to determine the leap years
        boolean isLeap = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);

        for (int i = 0; i < NUMBER_OF_MONTHS; i++){

            //assign values to the month variable
            switch (i){
                case 0: month = "January"; break;
                case 1: month = "February"; break;
                case 2: month = "March"; break;
                case 3: month = "April"; break;
                case 4: month = "May"; break;
                case 5: month = "June"; break;
                case 6: month = "July"; break;
                case 7: month = "August"; break;
                case 8: month = "September"; break;
                case 9: month = "October"; break;
                case 10: month = "November"; break;
                case 11: month = "December"; break;
            }

            //assign values to the firstDayOfTheYear variable
            switch (firstDayOfTheYear % 7){
                case 0: firstDay = "Sunday"; break;
                case 1: firstDay = "Monday"; break;
                case 2: firstDay = "Tuesday"; break;
                case 3: firstDay = "Wednesday"; break;
                case 4: firstDay = "Thursday"; break;
                case 5: firstDay = "Friday"; break;
                case 6: firstDay = "Saturday"; break;
            }

            //add the days of the months to the firstDay variable, to determine the next month's first day
            if (i == 1){ //february
                if (isLeap){
                    firstDayOfTheYear += 29;
                }
                else {
                    firstDayOfTheYear += 28;
                }
            }
            else if (i == 3 || i == 5 || i == 8 || i == 10){ //months that last 30 days
                firstDayOfTheYear += 30;
            }
            else { //months that last 31 days
                firstDayOfTheYear += 31;
            }

            //display the first day of each month in the year
            System.out.println(month + " 1, " + year + " is " + firstDay);
        }
    }
}
