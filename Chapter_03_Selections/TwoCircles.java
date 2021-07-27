/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
3. Programming Exercises 3.29, 137*/
import java.util.*;
public class TwoCircles {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter two circle's center and radius values
        System.out.print("Enter circle 1's center x-, y-coordinates, and radius: ");
        double circle1X = input.nextDouble();
        double circle1Y = input.nextDouble();
        double circle1Radius = input.nextDouble();

        System.out.print("Enter circle 2's center x-, y-coordinates, and radius: ");
        double circle2X = input.nextDouble();
        double circle2Y = input.nextDouble();
        double circle2Radius = input.nextDouble();

        //calculate the distance between the centers of circles
        double distanceBetweenCenters = Math.sqrt(Math.pow(circle2X - circle1X, 2) + Math.pow(circle2Y - circle1Y, 2));

        //display the result
        if (distanceBetweenCenters <= circle1Radius - circle2Radius){
            System.out.println("circle2 is inside circle1");
        }
        else if (distanceBetweenCenters <= circle1Radius + circle2Radius){
            System.out.println("circle2 overlaps circle1");
        }
        else {
            System.out.println("circle2 does not overlap circle1");
        }
    }
}
