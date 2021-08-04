/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6.6 Modularizing Code, 239 - 240*/
import java.util.*;
public class GreatestCommonDivisorMethod {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter two integers
        System.out.print("Enter an integer: ");
        int number1 = input.nextInt();
        System.out.print("Enter an integer: ");
        int number2 = input.nextInt();

        //display the result with invoking the gcd() method.
        System.out.println("The greatest common divisor for " + number1 + " and " + number2 + " is " + gcd(number1, number2));
    }
    //define the gcd() method
    public static int gcd (int number1, int number2){
        int gcd = 1;
        int k = 2;

        //search for the number that divides both number1 and number2 without a remainder.
        while (k <= number1 && k <= number2){
            if (number1 % k == 0 && number2 % k == 0){
                gcd = k;
            }
            k++;
        }
        return gcd; //return the gcd
    }
}
