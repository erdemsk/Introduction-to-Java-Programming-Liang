/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.36, 222*/
import java.util.*;
public class CheckingISBN {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter the first 9 digits of an ISBN number
        System.out.print("Enter the first 9 digits of an ISBN number: ");
        int isbnFirstNineDigits = input.nextInt();

        String isbn = "" + isbnFirstNineDigits;

        int lastDigit = 0;

        //(digitOne * 1 + digitTwo * 2 + ... + digitNine * 9) % 11 gives the last digit of an ISBN-10 number
        for (int i = 9; i >= 1; i--){
            lastDigit += (isbnFirstNineDigits % 10) * i;
            isbnFirstNineDigits /= 10;
        }

        lastDigit %= 11;

        //if the lastDigit %= 11 returns 10, the last digit is X
        if (lastDigit == 10){
            isbn += "X";
        }

        else {
            isbn += lastDigit;
        }

        //display the ISBN-10 number
        System.out.println("The ISBN-10 number is " + isbn);
    }
}
