/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 2. Programming Exercises 2.23, 96*/
import java.util.*;
public class CostOfDriving {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user to enter the distance, the fuel efficiency and price per gallon
        System.out.print("Enter the driving distance: ");
        double drivingDistance= input.nextDouble();

        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();

        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();

        //calculate the cost of driving
        double costOfDriving = (int) ((drivingDistance/milesPerGallon)*pricePerGallon*100)/100.0;

        //display the result
        System.out.println("The cost of driving is $"+costOfDriving);
    }
}
