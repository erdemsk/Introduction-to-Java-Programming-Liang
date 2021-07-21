/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3.10 Logical Operators, 118*/
import java.util.*;
public class Checkpoint_03_10_10 {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter weight and height
        System.out.print("Enter your weight in pounds: ");
        double weightInPounds = input.nextDouble();

        System.out.print("Enter your height in inches: ");
        double heightInInches = input.nextDouble();

        boolean boole = weightInPounds > 50 && heightInInches > 60;

        if (boole){
            System.out.println("Weight is greater than 50 pounds and height is greater than 60 inches.");
        }
        else {
            System.out.println("Weight is NOT greater than 50 pounds or height is NOT greater than 60 inches.");
        }
    }
}
