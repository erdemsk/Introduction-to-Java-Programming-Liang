/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.36, 267*/
import java.util.*;
public class AreaOfARegularPolygon {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter the number of sides and the length of a side of the regular polygon
        System.out.print("Enter the number of sides of the polygon: ");
        int numberOfSides = input.nextInt();
        System.out.print("Enter the length of a side of the polygon: ");
        double lengthOfASide = input.nextDouble();

        //display the result by invoking the area() method
        System.out.println("The area of the polygon is " + area(numberOfSides, lengthOfASide));
    }

    //return the area of a polygon
    public static double area(int n, double side){
        return n * Math.pow(side, 2) / (4 * Math.tan(Math.PI / n));
    }
}
