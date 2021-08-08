/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.32, 222*/
import java.util.*;
public class Lottery {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //initialize the lottery variables
        int lottery;
        int lotteryDigitOne;
        int lotteryDigitTwo;

        //create random two-digit numbers until the digits become different from each other
        while (true){
            //create a random number
            lottery = (int) (Math.random() * 100);
            lotteryDigitOne = lottery % 10;
            lotteryDigitTwo = lottery / 10;

            //if the randomly created numbers are not equal, exit the loop
            if (lotteryDigitOne != lotteryDigitTwo){
                break;
            }
        }

        //Ask the user to pick a lottery
        System.out.print("Enter your lottery pick (two-digits): ");
        int guess = input.nextByte();

        //split the digits
        int guessDigitOne = guess % 10;
        int guessDigitTwo = guess / 10;

        //display the lottery
        System.out.println("The lottery number is " + lottery);

        //display the prize
        if (lottery == guess){
            System.out.println("Exact match! You win $10,000");
        }

        else if (lotteryDigitOne == guessDigitTwo && lotteryDigitTwo == guessDigitOne){
            System.out.println("Reverse match! You win $3,000");
        }

        else if (lotteryDigitOne == guessDigitOne || lotteryDigitOne == guessDigitTwo ||
        lotteryDigitTwo == guessDigitOne || lotteryDigitTwo == guessDigitTwo){
            System.out.println("Match one digit! You win $1,000");
        }

        else {
            System.out.println("Sorry, no match!");
        }
    }
}
