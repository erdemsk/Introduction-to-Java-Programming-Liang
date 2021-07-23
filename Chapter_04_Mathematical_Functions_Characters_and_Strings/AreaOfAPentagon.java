/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4. Programming Exercises 4.1, 172*/
import java.util.*;
public class AreaOfAPentagon {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter the length from the center to a vertex
        System.out.print("Enter the length from the center to a vertex: ");
        double vertexLength = input.nextDouble();

        //calculate the length of a side and area of the pentagon
        double sideLength = 2 * vertexLength * Math.sin(Math.PI/5);
        double areaOfThePentagon = (5 * Math.pow(sideLength,2))/(4 * Math.tan(Math.PI/5));

        //display the result with two digits after the decimal point
        System.out.printf("The area of the pentagon is %.2f", areaOfThePentagon);
    }
}
