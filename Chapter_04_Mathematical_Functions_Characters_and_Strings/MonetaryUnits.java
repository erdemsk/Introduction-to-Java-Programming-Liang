/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4. Programming Exercises 4.26, 179*/
import java.util.*;
public class MonetaryUnits {
    public static void main(String[] args) {
        //Creating a Scanner object
        Scanner input = new Scanner(System.in);

        // Ask the user to enter an amount
        System.out.print("Enter the amount of dollar please (e.g. 11,56) $: ");
        //Read and convert the amount to cents
        String amount= input.next();
        String dollars = amount.substring(0,amount.indexOf(','));
        String cents = amount.substring(amount.indexOf(',') + 1);

        //find the index of ',' which separates dollar bills from coins
        int beforeDecimalPoint = amount.indexOf(',');

        int tensDollars = 0;
        int numberOfOneDollars = 0;

        /*if the amount is between 10-100 dollars (this can be written much more elegant by loops, which will
        be introduced in the next chapter*/
        if (beforeDecimalPoint == 2){
            tensDollars = Character.getNumericValue(dollars.charAt(0));
            numberOfOneDollars = Character.getNumericValue(dollars.charAt(1)) + tensDollars * 10;
        }
        //if the amount is between 1-10 dollars
        else if (beforeDecimalPoint == 1){
            numberOfOneDollars = Character.getNumericValue(dollars.charAt(0));
        }

        //extract the amount of cents, convert it from char to int by getNumericValue method
        int amountOfCents = Character.getNumericValue(cents.charAt(0)) * 10 + Character.getNumericValue(cents.charAt(1));

        //Divide the remaining cents by 25 to find the number of quarters. Obtain the remaining amount by using %25
        int numberOfQuarters = amountOfCents/25;
        amountOfCents %= 25;

        //Divide the remaining cents by 10 to find the number of dimes. Obtain the remaining amount by using %10
        int numberOfDimes = amountOfCents/10;
        amountOfCents %= 10;

        //Divide the remaining cents by 5 to find the number of nickels. Obtain the remaining amount by using %5
        int numberOfNickels = amountOfCents/5;
        amountOfCents %= 5;

        //The remaining amount at this point is consist of pennies
        int numberOfPennies = amountOfCents;

        //Displaying the result
        System.out.println("Your "+amount+"$ consists of: ");
        System.out.println(" "+numberOfOneDollars+" dollars");
        System.out.println(" "+numberOfQuarters+" quarters");
        System.out.println(" "+numberOfDimes+" dimes");
        System.out.println(" "+numberOfNickels+" nickels");
        System.out.println(" "+numberOfPennies+" pennies");
    }
}
