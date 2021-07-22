/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4.5 Case Studies, 166*/
import java.util.*;
public class LotteryUsingStrings {
    public static void main(String[] args) {
        //Generate a lottery as a two-digit string
        String lottery = "" + (int) (Math.random()*10) + (int) (Math.random()*10);

        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a guess
        System.out.print("Enter your lottery pick (two digits): ");
        String guess = input.nextLine();

        //extract the digits of the lottery and guess
        char lotteryDigit1 = lottery.charAt(0);
        char lotteryDigit2 = lottery.charAt(1);

        char guessDigit1 = guess.charAt(0);
        char guessDigit2 = guess.charAt(1);

        //display the result
        System.out.println("Lottery number is: "+lottery);

        //check exact match
        if (guess.equals(lottery)){
            System.out.println("Exact match! You won $10.000");
        }
        //if not, check whether the reversal of the guess matches the lottery
        else if (lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit1){
            System.out.println("All digits match! You won $3.000");
        }
        //if not, check whether one digit is in the lottery
        else if (lotteryDigit1 == guessDigit1
              || lotteryDigit1 == guessDigit2
              || lotteryDigit2 == guessDigit1
              || lotteryDigit2 == guessDigit2){
            System.out.println("Match one digit! You won $1.000");
        }
        //if not, nothing matches.
        else {
            System.out.println("Sorry, no match!");
        }
    }
}
