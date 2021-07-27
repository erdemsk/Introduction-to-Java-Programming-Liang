/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
3. Programming Exercises 3.33, 139-140*/
import java.util.*;
public class CompareCosts {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter the weight and price of the rice packages
        System.out.print("Enter weight and price for package 1: ");
        double weightOfPackage1 = input.nextDouble();
        double priceOfPackage1 = input.nextDouble();
        System.out.print("Enter weight and price for package 2: ");
        double weightOfPackage2 = input.nextDouble();
        double priceOfPackage2 = input.nextDouble();

        //display the result based on the unit price
        if ((weightOfPackage1 / priceOfPackage1) == (weightOfPackage2 / priceOfPackage2)) {
            System.out.println("Two packages have the same price");
        }
        else if ((weightOfPackage1 / priceOfPackage1) > (weightOfPackage2 / priceOfPackage2)){
            System.out.println("Package 1 has a better price");
        }
        else {
            System.out.println("Package 2 has a better price");
        }
    }
}
