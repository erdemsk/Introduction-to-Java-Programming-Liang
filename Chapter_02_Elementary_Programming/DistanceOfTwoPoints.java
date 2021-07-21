/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 2. Programming Exercises 2.15, 94*/
import java.util.*;
public class DistanceOfTwoPoints {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user (x1,y1) and (x2,y2) coordinates
        System.out.print("Enter x1 and y1: ");
        double x1= input.nextDouble();
        double y1= input.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2= input.nextDouble();
        double y2= input.nextDouble();

        //calculate the distance between given points
        double distanceBetweenPoints=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));

        //display the result
        System.out.println("The distance between the two points is "+distanceBetweenPoints);
    }
}
