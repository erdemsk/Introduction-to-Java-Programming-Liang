/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3. Programming Exercises 3.7, 131*/
import java.util.*;
public class MonetaryUnits {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter an amount
        System.out.println("Enter an amount in double, e.g. 11,56: ");
        double amount = input.nextDouble();

        //turn to amount to int as cents
        int remainingAmount = (int) (amount*100);

        //find the numbers of each monetary units
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount %= 100;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount %= 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount %= 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount %= 5;

        int numberOfPennies = remainingAmount;

        //display the result
        System.out.println("Your amount "+amount+ " consists of:");
        if (numberOfOneDollars != 0){
            if (numberOfOneDollars == 1){
                System.out.println(" "+numberOfOneDollars+" dollar");
            }
            else {
                System.out.println(" "+numberOfOneDollars+" dollars");
            }
        }
        if (numberOfQuarters != 0){
            if (numberOfQuarters == 1){
                System.out.println(" "+numberOfQuarters+" quarter");
            }
            else {
                System.out.println(" "+numberOfQuarters+" quarters");
            }
        }
        if (numberOfDimes != 0){
            if (numberOfDimes == 1){
                System.out.println(" "+numberOfDimes+" dime");
            }
            else {
                System.out.println(" "+numberOfDimes+" dimes");
            }
        }
        if (numberOfNickels != 0){
            if (numberOfNickels == 1){
                System.out.println(" "+numberOfNickels+" nickel");
            }
            else {
                System.out.println(" "+numberOfNickels+" nickels");
            }
        }
        if (numberOfPennies != 0){
            if (numberOfPennies == 1){
                System.out.println(" "+numberOfPennies+" penny");
            }
            else {
                System.out.println(" "+numberOfPennies+" pennies");
            }
        }

    }
}
