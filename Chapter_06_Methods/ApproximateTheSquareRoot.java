/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.22, 263*/
import java.util.*;
public class ApproximateTheSquareRoot {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a number
        System.out.print("Enter a number: ");
        long number = input.nextLong();

        //invoke the sqrt() method to approximate the square root of the number
        System.out.println("The square root of " + number + " is " + sqrt(number));
    }

    //declare a sqrt() method to apply the "Babylonian method"
    public static double sqrt (long n){
        double lastGuess;
        double nextGuess = 1;
        int numberOfGuesses = 0;

        do {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;
            numberOfGuesses++;
            //to display the each guess, execute the following statement
            //System.out.println(numberOfGuesses + ". guess is " + nextGuess);
        } while (Math.abs(nextGuess - lastGuess) > 0.0001);

        return nextGuess;
    }
}
