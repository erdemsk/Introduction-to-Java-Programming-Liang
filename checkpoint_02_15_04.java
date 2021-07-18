/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 2.15.4 Numeric Type Conversions, 81*/
import java.util.Scanner;

public class checkpoint_02_15_04 {
    public static void main(String[] args) {
        //Creating a Scanner object
        Scanner input = new Scanner(System.in);

        //Asking input from the user
        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is: $"+ (int)(tax*100) / 100);
    }
}
