/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 5.11 Case Studies, 204*/
import java.util.*;

public class TheGreatestCommonDivisor {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second integer: ");
        int secondNumber = input.nextInt();

        //initialize gcd variable to hold the value of greatest common divisor
        int gcd = 1; //1 is always a divisor, but it might not be the greatest common divisor
        int k = 2; //possible greatest common divisor
        //if both the first and second numbers are divisible by k without a remainder, update gcd ask k.
        while (k <= firstNumber && k <= secondNumber){
            if (firstNumber % k == 0 && secondNumber % k == 0){
                gcd = k;
            }
            k++;
        }
        //display the result
        System.out.println("The greatest common divisor for " + firstNumber + " and " + secondNumber + " is " + gcd);
    }
}
