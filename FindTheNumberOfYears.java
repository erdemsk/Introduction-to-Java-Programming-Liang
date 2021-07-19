/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 2. Programming Exercises 2.7, 92*/
import java.util.*;
public class FindTheNumberOfYears {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user to enter minutes
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();

        int totalDays =minutes/(60*24);
        int years=totalDays/365;
        int remainingDays = totalDays%365;

        System.out.println(minutes+" minutes is approximately "+years+" years and "+remainingDays+" days");

    }
}
