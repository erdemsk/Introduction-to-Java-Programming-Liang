/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3.11 Case Study: Determining Leap Year, 119*/
import java.util.*;
public class DeterminingLeapYear {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a year
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        //Check if the year is a leap year or not.
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        //display the result
        if (isLeapYear){
            System.out.println("Yes, "+year+" is a leap year!");
        }
        else {
            System.out.println("No, "+year+" is not a leap year.");
        }
    }
}
