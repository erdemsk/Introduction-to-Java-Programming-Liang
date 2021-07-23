/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4. Programming Exercises 4.2, 173*/
import java.util.*;
public class GreatCircleDistance {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter latitude and longitude of two points
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double x1InDegrees = input.nextDouble();
        double y1InDegrees = input.nextDouble();
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double x2InDegrees = input.nextDouble();
        double y2InDegrees = input.nextDouble();

        //convert the degrees into radians
        double x1InRadians = Math.toRadians(x1InDegrees);
        double x2InRadians = Math.toRadians(x2InDegrees);
        double y1InRadians = Math.toRadians(y1InDegrees);
        double y2InRadians = Math.toRadians(y2InDegrees);

        //calculate the great circle distance
        double radiusOfTheEarth = 6371.01;
        double greatCircleDistance = radiusOfTheEarth * Math.acos(Math.sin(x1InRadians)
                * Math.sin(x2InRadians) + Math.cos(x1InRadians) * Math.cos(x2InRadians)
                * Math.cos(y1InRadians - y2InRadians));
        //display the result
        System.out.printf("The distance between the two points is " + greatCircleDistance + " km");



    }
}
