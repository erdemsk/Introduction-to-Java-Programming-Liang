/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4. Programming Exercises 4.19, 178*/
import java.util.Scanner;
public class CheckISBN_10 {
    public static void main(String[] args) {
        //Rewrite of Programming Exercise 3.9 by entering the ISBN number as a string.

        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter first 9 digits of ISBN
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String isbn = input.next();

        //compute the 10th digit of ISBN number
        int d10 = (Character.getNumericValue(isbn.charAt(0)) * 1
                + Character.getNumericValue(isbn.charAt(1)) * 2
                + Character.getNumericValue(isbn.charAt(2)) * 3
                + Character.getNumericValue(isbn.charAt(3)) * 4
                + Character.getNumericValue(isbn.charAt(4)) * 5
                + Character.getNumericValue(isbn.charAt(5)) * 6
                + Character.getNumericValue(isbn.charAt(6)) * 7
                + Character.getNumericValue(isbn.charAt(7)) * 8
                + Character.getNumericValue(isbn.charAt(8)) * 9) % 11;

        //display the result
        if (d10 == 10){
            isbn += "X";
            System.out.println("The ISBN-10 number is " + isbn);
        }
        else {
            isbn += "" + d10;
            System.out.println("The ISBN-10 number is " + isbn);
        }
    }
}
