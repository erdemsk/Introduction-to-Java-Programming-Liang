/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 2. Programming Exercises 2.2, 91*/
import java.util.*;
public class ComputeTheVolumeOfATriangle {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask input from the user
        System.out.print("Enter length of the sides of the equilateral triangle: ");
        double lengthOfSides= input.nextDouble();

        //calculate area and volume of the triangle
        double area = (int) (Math.sqrt(3)/4*Math.pow(lengthOfSides,2)*100)/100.0;
        double volume = (int) (area*Math.sqrt(3)*lengthOfSides/2*100)/100.0;

        // display the result
        System.out.println("The area is: "+area);
        System.out.println("The volume is: "+volume);
    }
}
