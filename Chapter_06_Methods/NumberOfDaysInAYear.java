/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.16, 262*/
public class NumberOfDaysInAYear {
    public static void main(String[] args) {
        //define constants for the loop continuation condition
        final int START_YEAR = 2014;
        final int END_YEAR = 2034;

        //to display the number of days between 2014 and 2034
        for (int year = START_YEAR; year <= END_YEAR; year++){
            //invoke the numberOfDaysInAYear() method
            System.out.println("Number of days in " + year + " is " + numberOfDaysInAYear(year));
        }
    }

    //declare a method to determine the number of days in a year
    public static int numberOfDaysInAYear (int year){
        //create a boolean variable to determine the leap years
        boolean isLeap = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);

        //if the year is a leap year return 366, if not return 365
        return isLeap ? 366 : 365;
    }
}
