/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4. Programming Exercises 4.5, 174*/
import java.util.*;
public class AreaOfARegularPolygon {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter the number of sides of polygon and the length of a side
        System.out.print("Enter the number of sides: ");
        int numberOfSides = input.nextInt();
        System.out.print("Enter the length of a side: ");
        double lengthOfSides = input.nextDouble();

        //Compute the area of the regular polygon
        double areaOfARegularPolygon = numberOfSides * Math.pow(lengthOfSides, 2) / (4 * Math.tan(Math.PI/numberOfSides));

        //Display the result
        System.out.println("The area of the polygon is: " + areaOfARegularPolygon);
    }
}
