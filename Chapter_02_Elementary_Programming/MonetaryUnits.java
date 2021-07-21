/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 2. Programming Exercises 2.22, 96*/
import java.util.*;
public class MonetaryUnits {
    public static void main(String[] args) {
        /*This is the rewrite of CountingMonetaryUnits.java to prevent the possible loss of accuracy when converting
        a double value to an int. Entering 10.03$ as input creates two different results in these java files, and this
        is the accurate one*/

        //Creating a Scanner object
        Scanner input = new Scanner(System.in);

        // Ask the user to enter an amount
        System.out.print("Enter the amount of dollar with last two digits as cents. (e.g. 1156 for 11,56$) $: ");
        //Read and convert the amount to cents
        int remainingAmount= input.nextInt();

        //Divide the cents by 100 to find the number of one dollars. Obtain the remaining amount using %100
        int numberOfOneDollars = remainingAmount/100;
        remainingAmount %= 100;

        //Divide the remaining cents by 25 to find the number of quarters. Obtain the remaining amount by using %25
        int numberOfQuarters = remainingAmount/25;
        remainingAmount %= 25;

        //Divide the remaining cents by 10 to find the number of dimes. Obtain the remaining amount by using %10
        int numberOfDimes = remainingAmount/10;
        remainingAmount %= 10;

        //Divide the remaining cents by 5 to find the number of nickels. Obtain the remaining amount by using %5
        int numberOfNickels = remainingAmount/5;
        remainingAmount %= 5;

        //The remaining amount at this point is consist of pennies
        int numberOfPennies = remainingAmount;

        //Displaying the result
        System.out.println("Your "+remainingAmount+"$ consists of: ");
        System.out.println(" "+numberOfOneDollars+" dollars");
        System.out.println(" "+numberOfQuarters+" quarters");
        System.out.println(" "+numberOfDimes+" dimes");
        System.out.println(" "+numberOfNickels+" nickels");
        System.out.println(" "+numberOfPennies+" pennies");
    }
}
