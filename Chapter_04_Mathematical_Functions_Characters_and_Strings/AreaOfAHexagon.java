/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4. Programming Exercises 4.4, 173*/
import java.util.*;
public class AreaOfAHexagon {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter the length of a side of the hexagon
        System.out.print("Enter the length: ");
        double lengthOfSide = input.nextDouble();

        //compute the area of the hexagon
        double areaOfHexagon = 6 * Math.pow(lengthOfSide, 2) / (4 * Math.tan(Math.PI/6));

        //display the result
        System.out.printf("The area of the hexagon is %.2f", areaOfHexagon);
    }
}
