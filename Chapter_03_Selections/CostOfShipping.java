/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
3. Programming Exercises 3.18, 133*/
import java.util.*;
public class CostOfShipping {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter the weight of the package
        System.out.print("Enter the weight of the package in pounds: ");
        double weightInPounds = input.nextDouble();

        //initialize the cost
        double cost = 0.0;

        //calculate the cost of shipping based on the weight of the package
        if (weightInPounds > 20){
            System.out.println("The package cannot be shipped!");
            System.exit(1);
        }
        else if (weightInPounds <= 0){
            System.out.println("Please enter a positive number for the weight of the package!");
            System.exit(1);
        }
        else if (0 < weightInPounds && weightInPounds <= 2){
            cost = 2.5;
        }
        else if (2 < weightInPounds && weightInPounds <= 4){
            cost = 4.5;
        }
        else if (4 < weightInPounds && weightInPounds <= 10){
            cost = 7.5;
        }
        else {
            cost = 10.5; // for weights that are greater than 10 and less than or equal to 20 pounds
        }
        //display the result
        System.out.println("Cost of shipping will be $" + cost);
    }
}
