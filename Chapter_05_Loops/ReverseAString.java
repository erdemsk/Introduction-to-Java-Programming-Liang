/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.46, 224*/
import java.util.*;
public class ReverseAString {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a String
        System.out.print("Enter a string: ");
        String text = input.next();

        String reverseText = "";

        //rearrange the string in reverse order
        for (int i = 0; i < text.length(); i++){
            reverseText = text.charAt(i) + reverseText;
        }

        //display the reversed string
        System.out.println("The reversed string is: " + reverseText);
    }
}
