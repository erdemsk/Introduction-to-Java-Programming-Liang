//Introduction to Java Programming and Data Structures, Liang, 11th Edition, 2.7 Named Constants, 65-66
import java.util.*;

public class ComputeAreaWithConstant {
    public static void main(String[] args) {
        //Declaring a constant
        final double PI = 3.14159;

        //Creating a Scanner object
        Scanner input = new Scanner (System.in);

        //Asking the radius measure from the user
        System.out.println("Enter a number for radius: ");
        double radius = input.nextDouble();

        //Computing the area
        double area = radius*radius*PI;

        //Displaying the result
        System.out.println("The area for radius of "+radius+" is: "+area);
    }
}
