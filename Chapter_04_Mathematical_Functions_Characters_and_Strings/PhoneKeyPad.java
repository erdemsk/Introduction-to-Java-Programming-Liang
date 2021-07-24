/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4. Programming Exercises 4.15, 176*/
import java.util.*;
public class PhoneKeyPad {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter an uppercase or a lowercase letter
        System.out.print("Enter a letter: ");
        String letterString = input.nextLine();

        //Check if the input is more than a character
        if (letterString.length() != 1){
            System.out.println("Invalid input!");
            System.exit(1);
        }
        //hold the value of input in a char variable
        char letter = letterString.charAt(0);

        //display an error message if the input is not between a-z or A-Z
        if (Character.isLetter(letter)){
            letter = letterString.toUpperCase().charAt(0);

            //display the corresponding number
            if (65 <= letter && letter <= 67){
                System.out.println("The corresponding number is 2");
            }
            else if (68 <= letter && letter <= 70){
                System.out.println("The corresponding number is 3");
            }
            else if (71 <= letter && letter <= 73){
                System.out.println("The corresponding number is 4");
            }
            else if (74 <= letter && letter <= 76){
                System.out.println("The corresponding number is 5");
            }
            else if (77 <= letter && letter <= 79){
                System.out.println("The corresponding number is 6");
            }
            else if (80 <= letter && letter <= 83){
                System.out.println("The corresponding number is 7");
            }
            else if (84 <= letter && letter <= 86){
                System.out.println("The corresponding number is 8");
            }
            else if (87 <= letter && letter <= 90){
                System.out.println("The corresponding number is 9");
            }
        }
        //if the input has length 1 but not a letter
        else {
            System.out.println(letterString + " is an invalid input!");
        }
    }
}
