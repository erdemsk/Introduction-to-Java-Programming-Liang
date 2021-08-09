/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.48, 225*/
import java.util.*;
public class ProcessString {
    public static void main(String[] args) {
        final int ASCII_VALUE_OF_SPACE = 32;
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a String
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        //iterate through each character in the input
        for (int i = 0; i < text.length(); i++){
            //display the characters at even positions, except spaces
            if (i % 2 == 1 && text.charAt(i) != ASCII_VALUE_OF_SPACE){
                System.out.print(text.charAt(i));
                }
            }
        }
}
