/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.19, 262*/
import java.util.*;
public class Triangles {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter the length of the three sides of the triangle
        System.out.print("Enter side 1, side 2 and side 3: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        //check if the inputs are valid
        if (isValid(side1, side2, side3)){
            //invoke the area method to display the area of the triangle
            System.out.println("The area of the triangle is: " + (int) (area(side1, side2, side3) * 100) / 100.0);
        }
        else {
            System.out.println("Invalid input!");
        }
    }

    //check if the sum of every two sides is greater than the third side
    public static boolean isValid (double side1, double side2, double side3){
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }

    //calculate the area of the triangle
    public static double area (double side1, double side2, double side3){
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
