//Introduction to Java Programming and Data Structures, Liang, 11th Edition, 2.3 Reading Input from the Console, 59-60
import java.util.Scanner; //Scanner is in the java.util package

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Creating a Scanner object

        System.out.print("Enter a number for radius: "); // Asking a number from the user
        double radius = input.nextDouble(); //reading the value and assigning it to the "radius" variable

        double area = radius*radius*3.14159; //compute area

        //Display the result
        System.out.println("The area for the circle of radius "+radius+" is: "+area);
    }
}
