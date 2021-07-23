/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
3. Programming Exercises 3.15, 133*/
import java.util.*;
public class LotteryGame {
    public static void main(String[] args) {
        int lottery = (int) (Math.random()*1000);
        int lotteryDigits = lottery;
        System.out.println(lotteryDigits);

        int lotteryDigit3 = lotteryDigits % 10;
        lotteryDigits /= 10;
        int lotteryDigit2 = lotteryDigits % 10;
        lotteryDigits /= 10;
        int lotteryDigit1 = lotteryDigits;

        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to pick their guess
        System.out.print("Enter your guess (three-digits): ");
        int guess = input.nextInt();
        int guessDigits = guess;

        int guessDigit3 = guessDigits % 10;
        guessDigits /= 10;
        int guessDigit2 = guessDigits % 10;
        guessDigits /= 10;
        int guessDigit1 = guessDigits;

        if (lottery == guess) {
            System.out.println("Exact match! Lottery is " + lottery + " and you earned $12.000!");
        }
        else if (guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit2 && guessDigit3 == lotteryDigit1){
            System.out.println("All digits match in reversal order! The correct order is " + lottery + " and you earned $5.000!");
        }
        else if (guessDigit1 == lotteryDigit1
              || guessDigit1 == lotteryDigit2
              || guessDigit1 == lotteryDigit3
              || guessDigit2 == lotteryDigit2
              || guessDigit2 == lotteryDigit3
              || guessDigit3 == lotteryDigit3){
            System.out.println("At least one digit matches! The correct number is " + lottery + " and you earned $2.000!");
        }
        else {
            System.out.println("Sorry, no match!");
        }

    }
}
