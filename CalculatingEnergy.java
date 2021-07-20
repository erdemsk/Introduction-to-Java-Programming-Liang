/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 2. Programming Exercises 2.10, 93*/
import java.util.*;
public class CalculatingEnergy {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user the amount of water, initial and final temperatures
        System.out.print("Enter the amount of water in kilograms: ");
        double amountOfWater= input.nextDouble();

        System.out.print("Enter the initial temperature: ");
        double initialTemperature= input.nextDouble();

        System.out.print("Enter the final temperature: ");
        double finalTemperature = input.nextDouble();

        //calculate the energy needed
        double energy = amountOfWater*(finalTemperature-initialTemperature)*4184;

        //display the result
        System.out.println("The energy needed is "+energy+" Joule");

    }
}
