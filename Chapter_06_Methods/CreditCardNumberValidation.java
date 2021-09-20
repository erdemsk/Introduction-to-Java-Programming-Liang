/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.31, 265-266
Inspired from the http://soultionmanual.blogspot.com/2016/08/chapter-6-exercise-31-introduction-to.html
but I didn't just copy and paste it, but tried to improve the source code.
*/
import java.util.*;
public class CreditCardNumberValidation {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);
        long number;

        do {
            System.out.print("Enter a credit card number as a long integer (enter 0 to stop program): ");

            number = input.nextLong();

            if (number != 0) {
                if (isValid(number)) {
                    System.out.println(number + " is valid.");
                } else {
                    System.out.println(number + " is invalid.");
                }
            }

        } while (number != 0);
    }

    //return true if the card number is valid
    public static boolean isValid(long number) {
        // check 1st prefix
        int firstPrefix = (int) getPrefix(number, 1);

        if (firstPrefix != 4 && firstPrefix != 5 && firstPrefix != 3
                && firstPrefix != 6) {
            return false;
        }

        //check 2nd prefix
        if (firstPrefix == 3) {
            int secondPrefix = (int) getPrefix(number, 2);
            if (secondPrefix != 37) {
                return false;
            }
        }

        //if the sum of sumOfOddPlace and sumOfDoubleEvenPlace is divisible by 10 without a remainder, return true
        return (sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0;
    }

    //Get the result from 2. Step
    public static int sumOfDoubleEvenPlace(long number) {
        int n = getSize(number);
        int sum = 0;

        for (int i = 2; i <= n; i += 2) {
            sum += getDigit(2 * getDigitFromIndex(number, i));
        }
        return sum;
    }

    // Get digits from specific places. Index start from 1 and from the right to left.
    public static int getDigitFromIndex(long number, int index) {
        int digit;
        digit = (int) (((number / Math.pow(10, index - 1))) % 10);
        return digit;
    }

    //Return the number if it is a single digit, otherwise, return the sum of the two digits
    public static int getDigit(int number) {
        int firstDigit = number / 10;
        int secondDigit = number % 10;

        if (firstDigit == 0) {
            return number;
        }
        else {
            return firstDigit + secondDigit;
        }
    }

    // Return the sum of odd-place digits in the number
    public static int sumOfOddPlace(long number) {
        int n = getSize(number);
        int sum = 0;

        for (int i = 1; i <= n; i += 2) {
            sum += getDigitFromIndex(number, i);
        }
        return sum;
    }

    // Return true if the digit d is a prefix for the number
    public static boolean prefixMatched(long number, int d) {
        return getPrefix(number, getSize(d)) == d;
    }

    //Return the number of digits in d
    public static int getSize(long d) {
        int numberOfDigit = 1;
        while ((d = d / 10) != 0) {
            numberOfDigit++;
        }
        return numberOfDigit;
    }

    /*Return the first k number of digits from number. If the number of digits
    in number is less than k, return number.*/
    public static long getPrefix(long number, int k) {
        int numberOfDigit = getSize(number);
        return number / (long) (Math.pow(10.0, (numberOfDigit - k)));
    }
}