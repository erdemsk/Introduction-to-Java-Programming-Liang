/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
3. Programming Exercises 3.22, 134*/
import java.util.*;
public class PointInACircle {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a point
        System.out.print("Enter a point with two coordinates: ");
        double xOfPoint = input.nextDouble();
        double yOfPoint = input.nextDouble();

        //radius of the circle is 10 and center of the circle is (0,0)
        int radius = 10;

        //calculate the distance of given point to the center
        double distanceToCenter = Math.sqrt(Math.pow(xOfPoint,2) + Math.pow(yOfPoint, 2));

        //display the result
        if (distanceToCenter <= 10){
            System.out.println("Point (" + xOfPoint + " , " + yOfPoint + ") is in the circle");
        }
        else {
            System.out.println("Point (" + xOfPoint + " , " + yOfPoint + ") is NOT in the circle");
        }
    }
}
