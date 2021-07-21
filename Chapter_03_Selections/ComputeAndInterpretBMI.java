/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3.8 Case Study: Computing Body Mass Index, 111*/
import java.util.*;
public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter weight and height
        System.out.print("Enter your weight in pounds: ");
        double weightInPounds = input.nextDouble();

        System.out.print("Enter your height in inches: ");
        double heightInInches = input.nextDouble();

        //create constants for conversions from pounds to kilograms and inches to meters and do the conversion
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        double weightInKilograms = weightInPounds * KILOGRAMS_PER_POUND;
        double heightInMeters = heightInInches * METERS_PER_INCH;

        //calculate the body mass index
        double bodyMassIndex = weightInKilograms/Math.pow(heightInMeters,2);

        //display the result
        System.out.println("BMI is "+bodyMassIndex);
        if (bodyMassIndex<18.5){
            System.out.println("Underweight");
        }
        else if (bodyMassIndex<25){
            System.out.println("Normal");
        }
        else if (bodyMassIndex<30){
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
    }
}
