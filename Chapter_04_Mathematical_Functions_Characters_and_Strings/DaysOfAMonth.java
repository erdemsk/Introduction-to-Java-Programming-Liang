/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4. Programming Exercises 4.17, 177*/
import java.util.*;
public class DaysOfAMonth {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);
        //Ask the user to enter the year and the first 3 letters of a month name(the first letter as uppercase)
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a month (first 3 letters, e.g. Jan): ");
        String month = input.next();

        //Check if the year is a leap year or not
        boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);

        //If it is a leap year and the user asks how many days last February, display the result
        if ( isLeapYear && month.startsWith("Feb")){
            System.out.println(month + " has 29 days");
        }
        //Display the result for common years
        else {
            if (month.startsWith("Jan")){
                System.out.println(month + " has 31 days");
            }
            else if (month.startsWith("Feb")){
                System.out.println(month + " has 28 days");
            }
            else if (month.startsWith("Mar")){
                System.out.println(month + " has 31 days");
            }
            else if (month.startsWith("Apr")){
                System.out.println(month + " has 30 days");
            }
            else if (month.startsWith("May")){
                System.out.println(month + " has 31 days");
            }
            else if (month.startsWith("Jun")){
                System.out.println(month + " has 30 days");
            }
            else if (month.startsWith("Jul")){
                System.out.println(month + " has 31 days");
            }
            else if (month.startsWith("Aug")){
                System.out.println(month + " has 31 days");
            }
            else if (month.startsWith("Sep")){
                System.out.println(month + " has 30 days");
            }
            else if (month.startsWith("Oct")){
                System.out.println(month + " has 31 days");
            }
            else if (month.startsWith("Nov")){
                System.out.println(month + " has 30 days");
            }
            else if (month.startsWith("Dec")){
                System.out.println(month + " has 31 days");
            }
            else {
                System.out.println(month + " is not a correct month name");
            }
        }
    }
}
