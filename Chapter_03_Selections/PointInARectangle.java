/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
3. Programming Exercises 3.23, 135*/
import java.util.*;
public class PointInARectangle {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter coordinates of the point
        System.out.print("Enter a point with two coordinates: ");
        double xOfPoint = input.nextDouble();
        double yOfPoint = input.nextDouble();

        //Rectangle is centred at (0,0) with width 10 and height 5
        int heightOfTheRectangle = 5;
        int widthOfTheRectangle = 10;

        //check if the given point is in the rectangle or not
        if (Math.abs(xOfPoint) <= widthOfTheRectangle / 2 && Math.abs(yOfPoint) <= heightOfTheRectangle / 2){
            System.out.println("Point (" + xOfPoint + "," + yOfPoint + ") is in the rectangle.");
        }
        else {
            System.out.println("Point (" + xOfPoint + "," + yOfPoint + ") is NOT in the rectangle.");
        }
    }
}
