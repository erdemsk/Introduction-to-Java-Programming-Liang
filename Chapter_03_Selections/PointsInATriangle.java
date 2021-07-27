/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
3. Programming Exercises 3.27, 136*/
import java.util.*;
public class PointsInATriangle {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a point's x- and y-coordinates
        System.out.print("Enter a point's x- and y-coordinates: ");
        double xCoordinates = input.nextDouble();
        double yCoordinates = input.nextDouble();

        //compute the distance of hypotenuse point to the origin that has the same x- coordinate
        double xOfHypotenusePoint = xCoordinates;
        double yOfHypotenusePoint = - xOfHypotenusePoint / 2 + 100;
        double distanceOfHypotenuse = Math.sqrt(Math.pow(xOfHypotenusePoint, 2) + Math.pow(yOfHypotenusePoint, 2));

        //Find the distance of point to the origin
        double distanceOfPoint = Math.sqrt(Math.pow(xCoordinates, 2) + Math.pow(yCoordinates, 2));

        //check if distance of hypotenuse is greater than or equal to the distance of point to the origin
        if (distanceOfHypotenuse < distanceOfPoint){
            System.out.println("The point is NOT in the triangle");
        }
        else {
            System.out.println("The point is in the triangle");
        }
    }
}
