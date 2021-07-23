/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4. Programming Exercises 4.9, 175*/
import javax.sound.midi.Soundbank;
import java.util.*;
public class FindTheUnicodeOfACharacter {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a character
        System.out.print("Enter a character: ");
        char character = input.next().charAt(0);

        int unicode = (int) character;
        System.out.println("The unicode of character " + character + " is " + unicode);
    }
}
