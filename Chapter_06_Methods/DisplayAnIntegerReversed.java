/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.4, 258*/
import java.util.*;
public class DisplayAnIntegerReversed {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        //display the reversal of the number by invoking reverse() method
        reverse(number);
    }

    //display the reverse of an integer
    public static void reverse (int number){
        String numberString = "" + number;
        int reversalNumber = 0;

        System.out.print("The reversal of " + number + " is ");
        for (int i = 1; i <= numberString.length(); i++){
            reversalNumber += (number % 10) * Math.pow(10, numberString.length() - i);
            number /= 10;
        }

        //display the reversal of the number
        System.out.print(reversalNumber);
    }
}
