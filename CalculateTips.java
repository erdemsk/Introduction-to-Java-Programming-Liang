/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 2. Programming Exercises 2.5, 92*/
import java.util.*;
public class CalculateTips {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user the subtotal and gratuity values
        System.out.print("Enter the subtotal amount: $");
        int subtotal = input.nextInt();

        System.out.print("Enter the gratuity rate: %");
        double gratuityRate = input.nextDouble();

        //calculate the gratuity amount
        double gratuity=subtotal*gratuityRate/100.0;

        //calculate the total amount
        double total = subtotal + subtotal*gratuityRate/100;

        //display the result
        System.out.println("The gratuity is $"+gratuity+" and total is $"+total);
    }
}
