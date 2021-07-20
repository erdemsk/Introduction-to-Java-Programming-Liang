/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 2. Programming Exercises 2.16, 94*/
import java.util.*;
public class AreaOfAHexagon {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user the length of a side
        System.out.print("Enter the length of a side: ");
        double lengthOfASide= input.nextDouble();

        //calculate the area of the hexagon
        double areaOfTheHexagon = (int) (3*Math.sqrt(3)*Math.pow(lengthOfASide,2)/2*10000)/10000.0;

        //display the result
        System.out.println("The area of the hexagon is "+areaOfTheHexagon);

    }
}
