/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.7, 259*/
import java.util.*;
public class ComputeTheFutureInvestmentValue {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter the investment amount and the interest rate
        System.out.print("The amount invested: $");
        double investmentAmount = input.nextDouble();
        System.out.print("Annual interest rate: %");
        double interestRate = input.nextDouble() / 100;
        double monthlyInterestRate = interestRate / 12;

        //invoke the futureInvestmentValue() method according to the user inputs and print the future value for 30 years
        System.out.println("Years \t Future Value");
        for (int i = 1; i <= 30; i++) {
            System.out.printf("%d \t\t\t %8.2f\n", i, futureInvestmentValue(investmentAmount, monthlyInterestRate, i));
        }
    }

    //calculate the future investment value
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}

