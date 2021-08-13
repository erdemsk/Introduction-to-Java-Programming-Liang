/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.20, 263*/
import java.util.*;
public class CountTheLettersInAString {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a string
        System.out.print("Enter a string: ");
        String text = input.next();

        //invoke the countLetters() method to display the number of letters in the string
        System.out.println("Number of letters in '" + text + "' is " + countLetters(text));
    }

    public static int countLetters(String text) {
        //initialize a counter
        int numberOfLetters = 0;

        //increase the counter variable on each letter found
        for (int i = 0; i < text.length(); i++){
            if (Character.isLetter(text.charAt(i))){
                numberOfLetters++;
            }
        }

        //return the number of letters
        return numberOfLetters;
    }
}
