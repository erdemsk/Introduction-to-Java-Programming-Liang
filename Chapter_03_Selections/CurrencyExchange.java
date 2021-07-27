/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
3. Programming Exercises 3.31, 138*/
import java.util.*;
public class CurrencyExchange {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter the exchange rate from currency in U.S. dollars to Chinese RMB.
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int currencyChoice = input.nextInt();

        //if the conversion will be from USD to RMB
        if (currencyChoice == 0){
            System.out.print("Enter the dollar amount: ");
            double dollarAmount = input.nextDouble();
            System.out.println("$" + dollarAmount + " is " + (dollarAmount * exchangeRate) + " yuan");
        }
        //if the conversion will be from RMB to USD
        else if (currencyChoice == 1) {
            System.out.print("Enter the RMB amount: ");
            double rmbAmount = input.nextDouble();
            System.out.println(rmbAmount + " yuan is $" + (int) ((rmbAmount / exchangeRate) * 100)/100.0);
        }
        //if the input is neither 1 nor 0
        else {
            System.out.println("Incorrect input");
        }
    }
}
