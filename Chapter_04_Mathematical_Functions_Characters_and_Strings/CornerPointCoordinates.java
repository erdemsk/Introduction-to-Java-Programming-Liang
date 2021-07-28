/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4. Programming Exercises 4.7, 174*/
import java.util.*;
public class CornerPointCoordinates {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter the radius of the bounding circle of the pentagon
        System.out.print("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();

        //compute the coordinates of 5 points with the help of cosine and sine functions.
        double x1 = (int) (radius * Math.cos(1 * Math.PI / 10) * 100) / 100.0;
        double y1 = (int) (radius * Math.sin(1 * Math.PI / 10) * 100) / 100.0;
        double x2 = (int) (radius * Math.cos(Math.PI / 2) * 100) / 100.0;
        double y2 = (int) (radius * Math.sin(Math.PI / 2) * 100) / 100.0;
        double x3 = (int) (radius * Math.cos(9 * Math.PI / 10) * 100) / 100.0;
        double y3 = (int) (radius * Math.sin(9 * Math.PI / 10) * 100) / 100.0;
        double x4 = (int) (radius * Math.cos(13 * Math.PI / 10) * 100) / 100.0;
        double y4 = (int) (radius * Math.sin(13 * Math.PI / 10) * 100) / 100.0;
        double x5 = (int) (radius * Math.cos(17 * Math.PI / 10) * 100) / 100.0;
        double y5 = (int) (radius * Math.sin(17 * Math.PI / 10) * 100) / 100.0;

        //display the result
        System.out.println("The coordinates of five points on the pentagon are");
        System.out.printf("(%.2f, %.2f)", x1, y1);
        System.out.printf("\n(%.2f, %.2f)", x2, y2);
        System.out.printf("\n(%.2f, %.2f)", x3, y3);
        System.out.printf("\n(%.2f, %.2f)", x4, y4);
        System.out.printf("\n(%.2f, %.2f)", x5, y5);
    }
}
