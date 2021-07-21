/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 2. Programming Exercises 2.14, 94*/
import java.util.*;
public class ComputingBodyMassIndex {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask weight and height values from the user
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double heightInInches = input.nextDouble();

        //convert pounds to kilograms and inches to meters
        double weightInKilograms = weightInPounds*0.45359237;
        double heightInMeters = heightInInches*0.0254;

        //calculate the body mass index
        double bodyMassIndex = (int) (weightInKilograms/Math.pow(heightInMeters,2)*10000)/10000.0;

        //display the result
        System.out.println("BMI is "+bodyMassIndex);
    }
}
