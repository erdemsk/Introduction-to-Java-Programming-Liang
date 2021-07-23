/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4. Programming Exercises 4.8, 175*/
import java.util.*;
public class FindTheASCIICodeOfACharacter {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a character
        System.out.print("Enter a character: ");
        char character = input.next().charAt(0);

        int ascii = (int) character;

        System.out.println("The ASCII code for character " + character + " is " + ascii);



    }
}
