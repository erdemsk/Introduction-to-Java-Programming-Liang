/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.30, 221*/
import java.util.*;
public class CompoundValue {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter the savings amount, annual interest rate and months.
        System.out.print("Enter the savings amount: $");
        double savingsAmount = input.nextDouble();
        System.out.print("Enter the annual interest rate: %");
        double annualInterestRate = input.nextDouble() / 100;
        System.out.print("Enter the months: ");
        int months = input.nextInt();

        double monthlyInterestRate = annualInterestRate / 12;

        double compoundValue = savingsAmount * (1 + monthlyInterestRate);

        for (int i = 1; i < months; i++){
            compoundValue = (compoundValue + savingsAmount) * (1 + monthlyInterestRate);
        }

        //display the result
        System.out.println("After the " + months + "th month, the amount on your account will be $"
                + (int) (compoundValue * 100) / 100.0);
    }
}
