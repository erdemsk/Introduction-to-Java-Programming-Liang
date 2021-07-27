/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
3. Programming Exercises 3.32, 139*/
import java.util.*;
public class PointPosition {
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

        //display the position of P2 relative to P0 and P1
        if ((p1X - p0X) * (p2Y - p0Y) - (p2X - p0X) * (p1Y - p0Y) > 0){
            System.out.println("P2 is on the left side of the line");
        }
        else if ((p1X - p0X) * (p2Y - p0Y) - (p2X - p0X) * (p1Y - p0Y) == 0){
            System.out.println("P2 is on the same line");
        }
        else {
            System.out.println("P2 is on the right side of the line");
        }
    }
}
