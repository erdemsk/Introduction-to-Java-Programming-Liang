/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3.12 Case Study: Lottery, 120*/
import java.util.*;
public class Lottery {
    public static void main(String[] args) {

        //Create a random two-digit number and seperate it's tens and units digits.
        int lottery=(int) (Math.random()*100);
        int lotteryDigitOne = lottery/10;
        int lotteryDigitTwo = lottery%10;
        System.out.println(lottery);

        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to guess the correct number
        System.out.print("Enter your guess (two-digits): ");
        int guess = input.nextInt();

        //Seperate the user's guess to tens and units digits.
        int guessDigitOne = guess/10;
        int guessDigitTwo = guess%10;

        //initialize award and check if the user's guess match with the randomly generated number in any condition.
        int award = 0;

        if (guessDigitOne == lotteryDigitOne && guessDigitTwo == lotteryDigitTwo){
            award = 10000;
            System.out.println("Great! The correct answer was "+lottery+" and you earned $"+ award);
        }
        else if (guessDigitOne == lotteryDigitTwo && guessDigitTwo == lotteryDigitOne){
            award = 3000;
            System.out.println("Too close! The correct answer was "+lottery+" and you earned $"+award);
        }
        /* " ^ " (XOR) could also be used, but there is no need to evaluate all statements after one of them gets evaluated
        as true. The chance for exact match and digits match has been tested in the previous two condition
        so we can just use || (or) operator*/
        else if (guessDigitOne == lotteryDigitOne || guessDigitOne == lotteryDigitTwo ||
                guessDigitTwo == lotteryDigitOne || guessDigitTwo == lotteryDigitTwo) {
            award = 1000;
            System.out.println("It was close! The correct answer was "+lottery+" and you earned $"+award);
        }
        else {
            System.out.println("Unfortunately! The correct answer was "+lottery+" and you earned $"+award);
        }


    }
}
