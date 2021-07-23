/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3. Programming Exercises 3.9, 132*/
import java.util.*;
public class CheckISBN_10 {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter first 9 digits of ISBN
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int isbnFirstNineDigits = input.nextInt();
        int isbn = isbnFirstNineDigits;

        //separate the digits of the first nine characters of the ISBN
        int d9 = isbn % 10;
        isbn /= 10;

        int d8 = isbn % 10;
        isbn /= 10;

        int d7 = isbn % 10;
        isbn /= 10;

        int d6 = isbn % 10;
        isbn /= 10;

        int d5 = isbn % 10;
        isbn /= 10;

        int d4 = isbn % 10;
        isbn /= 10;

        int d3 = isbn % 10;
        isbn /= 10;

        int d2 = isbn % 10;
        isbn /= 10;

        int d1 = isbn % 10;

        //compute d10
        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        //display the result
        if (d10 == 10){
            System.out.println("The ISBN-10 number is " + isbnFirstNineDigits + "X");
        }
        else {
            System.out.println("The ISBN-10 number is " + isbnFirstNineDigits + d10);
        }
    }
}
