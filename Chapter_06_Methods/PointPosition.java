/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.39, 268*/
import java.util.*;
public class PointPosition {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter three points
        System.out.print("Enter P0: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();

        System.out.print("Enter P1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter P2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Check the position of P2 respectively to P0 and P1, by invoking the relating methods
        // Check if P2 is on the left side of the line from P0 to P1
        if (leftOfTheLine(x0, y0, x1, y1, x2, y2)){
            System.out.printf("(%.1f, %.1f) is on the left side of the line from (%.1f, %.1f) to (%.1f, %.1f)",
                    x2, y2, x0, y0, x1, y1);
        }
        // Check if P2 is on the same line with P0 and P1, or even on the line segment of them
        else if (onTheSameLine(x0, y0, x1, y1, x2, y2)){
            if (onTheLineSegment(x0, y0, x1, y1, x2, y2)){
                System.out.printf("(%.1f, %.1f) is on the line segment from (%.1f, %.1f) to (%.1f, %.1f)",
                        x2, y2, x0, y0, x1, y1);
            }
            else {
                System.out.printf("(%.1f, %.1f) is on the same line from (%.1f, %.1f) to (%.1f, %.1f)",
                        x2, y2, x0, y0, x1, y1);
            }
        }
        // If none of the methods listed above is true, then P2 is on the right side of the line from P0 to P1
        else {
            System.out.printf("(%.1f, %.1f) is on the right side of the line from (%.1f, %.1f) to (%.1f, %.1f)",
                    x2, y2, x0, y0, x1, y1);
        }
    }

    // Return true if point (x2, y2) is on the left side of the directed line from (x0, y0) to (x1, y1)
    public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2){
        return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) > 0;
    }

    // Return true if point (x2, y2) is on the same line from (x0, y0) to (x1, y1)
    public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2){
        return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0;
    }

    // Return true if point (x2, y2) is on the line segment from (x0, y0) to (x1, y1) */
    public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2){
        return (((x2 < x1 && x2 > x0) || (x2 < x0 && x2 > x1))
                && ((y2 < y1 && y2 > y0) || (y2 < y0 && y2 > y1)));
    }
}
