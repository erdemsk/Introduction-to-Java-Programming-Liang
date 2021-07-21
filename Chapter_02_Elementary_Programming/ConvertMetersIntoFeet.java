/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 2. Programming Exercises 2.3, 91*/
import java.util.*;
public class ConvertMetersIntoFeet {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner (System.in);

        //Ask input from the user
        System.out.print("Enter a value for meter: ");
        double meters= input.nextDouble();

        //convert meters into feet
        double feet = meters*3.2786;

        //display the result
        System.out.println(meters+" meters is "+feet+" feet");
    }
}
