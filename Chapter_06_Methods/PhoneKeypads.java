/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.21, 263*/
import java.util.*;
public class PhoneKeypads {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a String
        System.out.print("Enter a string: ");
        String text = input.next();

        for (int i = 0; i < text.length(); i++){
            //if the character at position i is a letter, invoke the getNumber() method
            if (Character.isLetter(text.toUpperCase().charAt(i))){
                System.out.print(getNumber(text.toUpperCase().charAt(i)));
            }
            //if the character is not a letter, print it directly
            else {
                System.out.print(text.charAt(i));
            }
        }
    }

    //declare a method to apply the international standard letter/number mapping for telephones
    public static int getNumber (char uppercaseLetter){
        int digit = -1;

        if (uppercaseLetter >= 'A' && uppercaseLetter <= 'C'){
            digit = 2;
        }
        else if (uppercaseLetter >= 'D' && uppercaseLetter <= 'F'){
            digit = 3;
        }
        else if (uppercaseLetter >= 'G' && uppercaseLetter <= 'I'){
            digit = 4;
        }
        else if (uppercaseLetter >= 'J' && uppercaseLetter <= 'L'){
            digit = 5;
        }
        else if (uppercaseLetter >= 'M' && uppercaseLetter <= 'O'){
            digit = 6;
        }
        else if (uppercaseLetter >= 'P' && uppercaseLetter <= 'S'){
            digit = 7;
        }
        else if (uppercaseLetter >= 'T' && uppercaseLetter <= 'V'){
            digit = 8;
        }
        else if (uppercaseLetter >= 'W' && uppercaseLetter <= 'Z'){
            digit = 9;
        }

        return digit;
    }
}
