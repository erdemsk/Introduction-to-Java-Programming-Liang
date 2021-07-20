/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 2. Programming Exercises 2.12, 93*/
import java.util.*;
public class FindingRunwayLength {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user to enter speed and acceleration values
        System.out.print("Enter the take-off speed (m/s): ");
        double speed = input.nextDouble();

        System.out.print("Enter the acceleration(m/s^2): ");
        double acceleration = input.nextDouble();

        //calculate the minimum runway length
        double minimumRunwayLength = (int) (Math.pow(speed,2)/(2*acceleration)*1000)/1000.0;

        //display the result
        System.out.println("The minimum runway length for this airplane is: "+minimumRunwayLength);
    }
}
