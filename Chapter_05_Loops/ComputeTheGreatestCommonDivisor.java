/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.13, 218*/
import java.util.*;
public class ComputeTheGreatestCommonDivisor {
    public static void main(String[] args) {
        int minimum;
        int gcd = 1;
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter two integers
        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        //determine the smaller number
        if (number1 > number2){
            minimum = number2;
        }
        else {
            minimum = number1;
        }

        /* create a loop that checks if the minimum number is the gcd of these numbers or not,
        if not keep decreasing the minimum number until it reaches to 1 */
        while (minimum > 1){
            if (number1 % minimum == 0 && number2 % minimum == 0){
                gcd = minimum;
                break;
            }
            minimum--;
        }
        //display the result
        System.out.println("The greatest common divisor of " + number1 + " and " + number2 + " is " + gcd);
    }
}
