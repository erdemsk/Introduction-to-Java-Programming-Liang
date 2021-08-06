/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.2, 258*/
import java.util.*;
public class SumTheDigitsInAnInteger {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a number
        System.out.print("Enter a number: ");
        long number = input.nextLong();

        //Display the sum of all digits in the number
        System.out.println("The sum of the digits of the number: " + sumDigits(number));
    }
    public static int sumDigits(long n){
        String numberString = "";
        numberString += n;
        int sumOfDigits = 0;

        //calculate the sum of all digits
        for (int i = 0; i < numberString.length(); i++){
            //extract the last digit from the number and add it to the sum
            sumOfDigits += n % 10;

            //remove the last digit from the number
            n /= 10;
        }

        //return the sum of all digits in the number
        return sumOfDigits;
    }
}
