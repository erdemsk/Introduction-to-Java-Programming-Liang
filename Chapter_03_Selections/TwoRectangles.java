/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
3. Programming Exercises 3.28, 137*/
import java.util.*;
public class TwoRectangles {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter the coordinates of the center, width, and height values of rectangles
        System.out.print("Enter r1's center x-, y- coordinates, width and height: ");
        double r1X = input.nextDouble();
        double r1Y = input.nextDouble();
        double r1Width = input.nextDouble();
        double r1Height = input.nextDouble();

        System.out.print("Enter r2's center x-, y- coordinates, width and height: ");
        double r2X = input.nextDouble();
        double r2Y = input.nextDouble();
        double r2Width = input.nextDouble();
        double r2Height = input.nextDouble();

        //find the distance between centers of rectangles
        double distanceBetweenCenters = Math.sqrt(Math.pow(r2X - r1X, 2) + Math.pow(r2Y - r1Y, 2));

        //find the length of the diagonals in both rectangles
        double lengthOfDiagonal1 = Math.sqrt(Math.pow(r1Width, 2) + Math.pow(r1Height, 2));
        double lengthOfDiagonal2 = Math.sqrt(Math.pow(r2Width, 2) + Math.pow(r2Height, 2));

        //check if r2 is inside r1
        if (distanceBetweenCenters < lengthOfDiagonal1 / 2 - lengthOfDiagonal2 / 2){
            System.out.println("r2 is inside r1");
        }
        //check if r2 overlaps r1
        else if (distanceBetweenCenters < lengthOfDiagonal1 / 2 + lengthOfDiagonal2 / 2){
            System.out.println("r2 overlaps r1");
        }
        else {
            System.out.println("r2 does not overlap r1");
        }
    }
}

