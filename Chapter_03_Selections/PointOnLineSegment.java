/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
3. Programming Exercises 3.34, 140*/
import java.util.*;
public class PointOnLineSegment {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter three points
        System.out.print("Enter the x- and y-coordinates of P0: ");
        double p0X = input.nextDouble();
        double p0Y = input.nextDouble();
        System.out.print("Enter the x- and y-coordinates of P1: ");
        double p1X = input.nextDouble();
        double p1Y = input.nextDouble();
        System.out.print("Enter the x- and y-coordinates of P2: ");
        double p2X = input.nextDouble();
        double p2Y = input.nextDouble();

        //Check if P2 is on the line segment from P0 to P1 or not and display the result
        if (((p0X < p2X && p2X < p1X) && (p0Y < p2Y && p2Y < p1Y)) || ((p1X < p2X && p2X < p0X) && (p1Y < p2Y && p2Y < p0Y))){
            System.out.println("(" + p2X + ", " + p2Y + ")" + " is on the line segment from (" + p0X + ", " + p0Y + ") to (" + p1X + ", " + p1Y + ")");
        }
        else {
            System.out.println("(" + p2X + ", " + p2Y + ")" + " is NOT on the line segment from (" + p0X + ", " + p0Y + ") to (" + p1X + ", " + p1Y + ")");
        }
    }
}
