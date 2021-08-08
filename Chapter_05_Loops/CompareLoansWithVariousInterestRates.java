/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.21, 219*/
import java.util.*;
public class CompareLoansWithVariousInterestRates {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter the loan amount and years
        System.out.print("Enter the loan amount: $");
        int loanAmount = input.nextInt();

        System.out.print("Enter the number of years: ");
        byte numberOfYears = input.nextByte();

        double monthlyPayment = 0;

        //display the header of the table
        System.out.print("Interest Rate \t Monthly Payment \t Total Payment\n");
        //display the monthly and total payment amounts for various interest rates from 5% to 10%, increased by %0.25
        for (double annualInterestRate = 5.000; annualInterestRate <= 10.000; annualInterestRate += 0.250){
            //compute the monthly interest rate
            double monthlyInterestRate = annualInterestRate / (12 * 100);

            //compute the monthly payment
            monthlyPayment = loanAmount * monthlyInterestRate / (1 -
                    1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

            //compute the total payment
            double totalPayment = monthlyPayment * numberOfYears * 12;

            //display the result
            System.out.printf("%,6.3f%% %,19.2f %,19.2f\n", annualInterestRate, monthlyPayment, totalPayment);
        }
    }
}
