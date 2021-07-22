/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4.2 Common Mathematical Functions, 145*/
import java.util.*;
public class ComputeAngles {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter coordinates of the triangle
        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.print("Enter x3 and y3: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        //compute the lengths of sides of the triangle
        double a = Math.sqrt(Math.pow(x2 - x3,2) + Math.pow(y2 - y3,2));
        double b = Math.sqrt(Math.pow(x1 - x3,2) + Math.pow(y1 - y3,2));
        double c = Math.sqrt(Math.pow(x1 - x2,2) + Math.pow(y1 - y2,2));

        //determine the angles of triangle
        double angleA = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
        double angleB = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        double angleC = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));

        //display the result
        System.out.println("A is: " + Math.round(angleA * 100) / 100.0);
        System.out.println("B is: " + Math.round(angleB * 100) / 100.0);
        System.out.println("C is: " + Math.round(angleC * 100) / 100.0);
    }
}
