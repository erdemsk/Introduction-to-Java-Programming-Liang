/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4. Programming Exercises 4.22, 178*/
import java.util.*;
public class CheckSubstring {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter two strings
        System.out.print("Enter first string: ");
        String firstString = input.next();
        System.out.print("Enter second string: ");
        String secondString = input.next();

        if (firstString.contains(secondString)){
            System.out.println(secondString + " is a substring of " + firstString);
        }
        else {
            System.out.println(secondString + " is NOT a substring of " + firstString);
        }
    }
}
