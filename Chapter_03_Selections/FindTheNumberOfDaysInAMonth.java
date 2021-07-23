/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3. Programming Exercises 3.11, 132*/
import java.util.*;
public class FindTheNumberOfDaysInAMonth {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a month and a year
        System.out.print("Enter the month: ");
        int month = input.nextInt();
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        //determine the leap years and set february to 29 days
        if (year % 4 == 0 && ((year % 100 != 0) || (year % 400 ==0))){
            switch (month){
                case 1: System.out.println("January " + year + " has 31 days"); break;
                case 2: System.out.println("February " + year + " has 29 days"); break;
                case 3: System.out.println("March " + year + " has 31 days"); break;
                case 4: System.out.println("April " + year + " has 30 days"); break;
                case 5: System.out.println("May " + year + " has 31 days"); break;
                case 6: System.out.println("June " + year + " has 30 days"); break;
                case 7: System.out.println("July " + year + " has 31 days"); break;
                case 8: System.out.println("August " + year + " has 31 days"); break;
                case 9: System.out.println("September " + year + " has 30 days"); break;
                case 10: System.out.println("October " + year + " has 31 days"); break;
                case 11: System.out.println("November " + year + " has 30 days"); break;
                case 12: System.out.println("December " + year + " has 31 days"); break;
            }
        }
        //if the input is not a leap year
        else {
            switch (month){
                case 1: System.out.println("January " + year + " has 31 days"); break;
                case 2: System.out.println("February " + year + " has 28 days"); break;
                case 3: System.out.println("March " + year + " has 31 days"); break;
                case 4: System.out.println("April " + year + " has 30 days"); break;
                case 5: System.out.println("May " + year + " has 31 days"); break;
                case 6: System.out.println("June " + year + " has 30 days"); break;
                case 7: System.out.println("July " + year + " has 31 days"); break;
                case 8: System.out.println("August " + year + " has 31 days"); break;
                case 9: System.out.println("September " + year + " has 30 days"); break;
                case 10: System.out.println("October " + year + " has 31 days"); break;
                case 11: System.out.println("November " + year + " has 30 days"); break;
                case 12: System.out.println("December " + year + " has 31 days"); break;
            }
        }
    }
}
