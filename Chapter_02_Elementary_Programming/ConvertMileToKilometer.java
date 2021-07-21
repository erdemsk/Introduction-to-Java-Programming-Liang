/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 2. Programming Exercises 2.1, 91*/
import java.util.*;
public class ConvertMileToKilometer {
    public static void main(String[] args) {

        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask input from the user
        System.out.print("Enter miles: ");
        double miles = input.nextDouble();

        //convert miles to kilometers
        double kilometers = miles * 1.6;

        //display the result
        System.out.println((int) miles+" miles is "+ (int)(kilometers*100)/100.0+" kilometers");
    }
}
