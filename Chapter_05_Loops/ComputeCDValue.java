/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.31, 222*/
import java.util.*;
public class ComputeCDValue {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter the initial deposit amount, annual interest rate and number of months
        System.out.print("Enter the initial deposit amount: $");
        double amount = input.nextInt();
        System.out.print("Enter annual percentage yield: %");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter maturity period (number of months): ");
        int numberOfMonths = input.nextInt();

        //compute the monthly interest rate
        double monthlyInterest = annualInterestRate / (12 * 100);

        //display the table header
        System.out.print("Month \t CD Value\n");
        for (int month = 1; month <= numberOfMonths; month++){
            //compute the CD value after each month
            amount += amount * monthlyInterest;

            //display the result
            System.out.printf("%d \t\t %.2f\n", month, amount);
        }
    }
}
