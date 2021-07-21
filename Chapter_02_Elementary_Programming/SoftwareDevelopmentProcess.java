/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 2.16 Software Development Process, 81-84*/
import java.util.Scanner;

public class SoftwareDevelopmentProcess {
    public static void main(String[] args) {

        //Creating a Scanner object
        Scanner input= new Scanner(System.in);

        //Ask annual interest rate from the user
        System.out.print("Please enter the annual interest rate (e.g. 5,25): %");
        //Read the input and convert it to annual interest rate
        double annualInterestRate= input.nextDouble()/100;
        //Compute the monthyl interest rate
        double monthlyInterestRate = annualInterestRate/12;

        //Ask number of years from the user
        System.out.print("Please enter the number of years (e.g. 10): ");
        int numberOfYears = input.nextInt();

        //Ask amount of loan from the user
        System.out.print("Please enter the loan amount (e.g. 123456,78): $");
        double loanAmount = input.nextDouble();

        //calculate the monthly and total payments
        double monthlyPayment= loanAmount*monthlyInterestRate/(1-1/Math.pow(1+monthlyInterestRate,numberOfYears*12));
        double totalPayment=monthlyPayment*numberOfYears*12;

        // display the results
        System.out.println("Monthly payment: $"+(int) (monthlyPayment*100)/100.0);
        System.out.println("Total payment: $"+(int) (totalPayment*100)/100.0);
    }
}
