/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.47, 225*/
import java.util.*;
public class CheckISBN13 {
    public static void main(String[] args) {
        final int INPUT_LENGTH = 12;
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter the first 12 digits
        System.out.print("Enter the first 12 digits of the ISBN-13 number: ");
        String isbnFirstDigits = input.next();

        //if the input's length is not 12, terminate the program
        if (isbnFirstDigits.length() != 12){
            System.out.println(isbnFirstDigits + " is an invalid input, you must enter exactly 12 digits!");
            System.exit(1);
        }

        String isbn;
        int checkSum = 0;

        // find the checksum -> digit1 * 1 + 3 * digit2 + digit3 + 3 * digit4 + ... + 3 * digit12
        for (int i = 0; i < INPUT_LENGTH; i++){
            //check if all the characters are digits
            if (Character.isDigit(isbnFirstDigits.charAt(i))){
                if (i % 2 == 0){
                    checkSum = checkSum + Character.getNumericValue(isbnFirstDigits.charAt(i));
                }

                else {
                    checkSum = checkSum + 3 * Character.getNumericValue(isbnFirstDigits.charAt(i));
                }
            }

            //if the length of the string is 12 but it doesn't consist of numbers, terminate the program
            else {
                System.out.println(isbnFirstDigits + " is an invalid input, you must use only digits!");
                System.exit(1);
            }
        }

        //Find the last digit 10 - check sum % 10
        int lastDigit = 10 - checkSum % 10;

        //if the result of the above calculation is 10, put 0 to the end
        if (lastDigit == 10){
            isbn = isbnFirstDigits + "0";
        }

        else {
            isbn = isbnFirstDigits + lastDigit;
        }

        //display the result
        System.out.println("The ISBN-13 number is: " + isbn);
    }
}
