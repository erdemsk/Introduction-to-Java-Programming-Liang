/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3. Programming Exercises 3.6, 131*/
import java.util.*;
public class BodyMassIndex {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter weight in pounds and height in  and inches
        System.out.print("Enter your weight in pounds: ");
        double weightInPounds = input.nextDouble();

        System.out.print("Enter feet: ");
        double feetOfHeight = input.nextDouble();

        System.out.print("Enter inches: ");
        double inchesOfHeight = input.nextDouble();

        //Create constants for conversions from pounds to kilograms and from feet and inches to meters.
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_FEET = 0.3048;
        final double METERS_PER_INCH = 0.0254;

        //compute the body mass index
        double bodyMassIndex = (weightInPounds*KILOGRAMS_PER_POUND)/Math.pow(feetOfHeight*METERS_PER_FEET+inchesOfHeight*METERS_PER_INCH,2);

        //display the result
        System.out.println("BMI is "+bodyMassIndex);
        if (bodyMassIndex < 18.5){
            System.out.println("Underweight");
        }
        else if (bodyMassIndex < 25){
            System.out.println("Normal");
        }
        else if (bodyMassIndex < 30){
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
    }
}
