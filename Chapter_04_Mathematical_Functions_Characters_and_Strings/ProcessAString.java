/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4. Programming Exercises 4.20, 178*/
import java.util.*;
public class ProcessAString {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a String
        System.out.print("Enter a string: ");
        String entry = input.next();

        //display the length of the string and the last character
        System.out.println("The length of " + entry + " is " + entry.length());
        System.out.println("The last character of " + entry + " is " + entry.charAt(entry.length()-1));
    }
}
