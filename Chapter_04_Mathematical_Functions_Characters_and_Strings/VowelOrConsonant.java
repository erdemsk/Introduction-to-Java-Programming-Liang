/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4. Programming Exercises 4.13, 176*/
import java.util.*;
public class VowelOrConsonant {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a letter
        System.out.print("Enter a letter: ");
        String letterString = input.nextLine();
        if (letterString.length() != 1){
            System.out.println("Invalid input!");
            System.exit(1);
        }

        char letter = letterString.charAt(0);

        if(('a' <= letter && letter <= 'z') || ('A' <= letter && letter <= 'Z')){
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'
             || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'){
                System.out.println(letter + " is a vowel");
            }
            else {
                System.out.println(letter + " is a consonant");
            }
        }
        else {
            System.out.println("Invalid input!");
            System.exit(1);
        }
    }
}
