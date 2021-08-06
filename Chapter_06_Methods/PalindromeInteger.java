/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.3, 258*/
import java.util.*;
public class PalindromeInteger {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Reversal of " + number + " is " + reverse(number) + ", so " + isPalindrome(number));
    }

    //return true if number is a palindrome
    public static boolean isPalindrome(int number){
        return number == reverse(number);
    }

    //return the reversal of an integer
    public static int reverse(int number){
        String numberString = "" + number;
        int reversalNumber = 0;

        for (int i = 1; i <= numberString.length(); i++){
            //swap the last digit with the first digit and remove it from the number, then continue to swapping numbers between
            reversalNumber += (number % 10) * Math.pow(10, numberString.length() - i);
            number /= 10;
        }
        return reversalNumber;
    }
}
