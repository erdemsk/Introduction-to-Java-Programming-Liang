/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.22, 219*/
import java.util.*;
public class LoanAmortizationSchedule {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter the loan amount, number of years, and annual interest rate
        System.out.print("Enter the loan amount: $");
        double balance = input.nextDouble();

        System.out.print("Enter the number of years: ");
        byte numberOfYears = input.nextByte();

        System.out.print("Enter the annual interest rate: %");
        double annualInterestRate = input.nextDouble() / 100;

        //determine the monthly interest rate
        double monthlyInterestRate = annualInterestRate / 12;

        //compute the monthly and total payments
        double monthlyPayment = balance * monthlyInterestRate / (1 -
                1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;

        //display the monthly and total payment amounts
        System.out.printf("\nMonthly payment: %.2f\nTotal payment: %.2f\n", monthlyPayment, totalPayment);

        //compute and display the principal, interest and balance amounts for every payment
        System.out.print("\nPayment# \t Interest \t Principal \t Balance\n");
        for (int i = 1; i <= numberOfYears * 12; i++){
            //compute the monthly interest by multiplying the monthly interest rate with balance
            double monthlyInterest = monthlyInterestRate * balance;

            //principal is the amount of monthly payment - monthly interest
            double principal = monthlyPayment - monthlyInterest;

            //deduct the principal amount from the balance
            balance -= principal;

            //display the result
            System.out.printf("%-6d %11.2f %12.2f %12.2f\n", i, monthlyInterest, principal, balance);
        }
    }
}
