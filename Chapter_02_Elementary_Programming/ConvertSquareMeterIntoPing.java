/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 2. Programming Exercises 2.4, 92*/
import java.util.*;
public class ConvertSquareMeterIntoPing {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask input from the user
        System.out.print("Enter a number in square meters: ");
        double squareMeters = input.nextDouble();

        //convert square meters to ping
        double ping = squareMeters*0.3025;

        //display the result
        System.out.println(squareMeters+" square meters is "+ping+ " ping");
    }
}
