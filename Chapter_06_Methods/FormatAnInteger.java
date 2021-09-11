/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.37, 267*/
import java.util.*;
public class FormatAnInteger {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a number and a value for the width
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.print("Enter the width of the number: ");
        int width = input.nextInt();

        //display the formatted String by invoking the format() method
        System.out.println(format(number, width));
    }

    public static String format (int number, int width){
        StringBuilder output = new StringBuilder();
        String numberString = "" + number;
        int numberOfPrefixZeros = width - numberString.length();

        /*if the width is greater than the width of the number, add 0's until their width will be equal.
        if the width is less than the width of the number, return the number itself*/
        for (int i = 0; i < numberOfPrefixZeros; i++){
            output.append('0');
        }

        //add numberString after the prefix 0's
        output.append(numberString);

        //return the formatted String
        return output.toString();
    }
}
