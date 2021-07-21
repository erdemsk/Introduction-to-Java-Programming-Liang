/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 2. Programming Exercises 2.19, 95*/
import java.util.*;
public class AreaOfATriangle {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user for the coordinates of the points of the triangle
        System.out.println("Enter the coordinates of three points seperated by spaces: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        //find the lengths of the sides:
        double lengthOfFirstSide =  Math.sqrt((Math.pow(x2-x1,2))+Math.pow(y2-y1,2));
        double lengthOfSecondSide = Math.sqrt((Math.pow(x3-x1,2))+Math.pow(y3-y1,2));
        double lengthOfThirdSide =  Math.sqrt((Math.pow(x3-x2,2))+Math.pow(y3-y2,2));

        // find the s in the formula and calculate the area of the triangle
        double s = (lengthOfFirstSide + lengthOfSecondSide + lengthOfThirdSide)/2;
        double area = Math.sqrt(s*(s-lengthOfFirstSide)*(s-lengthOfSecondSide)*(s-lengthOfThirdSide));

        //display the result
        System.out.println("The area of the triangle is "+(int) (area*100)/100.0);
    }
}
