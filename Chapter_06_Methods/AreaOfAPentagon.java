/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.35, 267*/
import java.util.*;
public class AreaOfAPentagon {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter the length of a side of the pentagon
        System.out.print("Enter the length of a side of the pentagon: ");
        double side = input.nextDouble();

        System.out.println("The area of the pentagon is " + area(side));
    }

    public static double area (double side){
        return 5 * Math.pow(side, 2) / (4 * Math.tan(Math.PI / 5));
    }
}
