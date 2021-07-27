/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
3. Programming Exercises 3.25, 135*/
import java.util.*;
public class IntersectingPoint {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter four points
        System.out.print("Enter Point 1 (x, y): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter Point 2 (x, y): ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.print("Enter Point 3 (x, y): ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        System.out.print("Enter Point 4 (x, y): ");
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        //create the variables to apply Cramer's rule for solving 2x2 linear equations (see page 54)
        double a = y1 - y2;
        double b = x2 - x1;
        double c = y3 - y4;
        double d = x4 - x3;
        double e = (y1 - y2) * x1 - (x1 - x2) * y1;
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;

        // check if the equation has a solution or not, and display the result
        if (a * d - b * c != 0){
            double x = (int) ((e * d - b * f) / (a * d - b * c) * 100000) / 100000.0;
            double y = (int) ((a * f - e * c) / (a * d - b * c) * 100000) / 100000.0;
            System.out.println("The intersecting point is at (" + x + ", " + y + ")");
        }
        else {
            System.out.println("The two lines are parallel.");
        }
    }
}
