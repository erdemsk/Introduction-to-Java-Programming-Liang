/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 2. Programming Exercises 2.21, 96*/
import java.util.*;
public class CalculateFutureInvestmentValue {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user to enter investment amount, annual interest rate and number of years
        System.out.print("Enter investment amount: $");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate: %");
        double annualInterestRate = input.nextDouble()/100;
        double monthlyInterestRate = annualInterestRate/12;

        System.out.print("Enter number of years: ");
        double numberOfYears = input.nextDouble();

        //calculate the future investment value
        double futureInvestmentValue = (int) (investmentAmount * Math.pow(1+monthlyInterestRate,numberOfYears*12)*100)/100.0;

        //display the result
        System.out.println("Future value is $"+futureInvestmentValue);
    }
}
