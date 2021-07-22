/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4.5 Case Studies, 165*/
import java.util.*;
public class HexDigit2Dec {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a hexadecimal digit
        System.out.print("Enter a hexadecimal digit: ");
        String hexString = input.nextLine();

        //Check if the hexString has exactly one character or not
        if (hexString.length() != 1){
            System.out.println("You must enter exactly one digit!");
            System.exit(1);
        }

        // convert the input to uppercase in case of it is in lowercase
        char ch = Character.toUpperCase(hexString.charAt(0));

        // if hex digit ranges from A to F
        if ('A' <= ch && ch <= 'F'){
            int value = ch - 'A' + 10;
            System.out.println("The decimal value for hex digit " + ch + " is " + value);
        }

        // if the input ranges from 0 to 9
        else if (Character.isDigit(ch)){
            System.out.println("The decimal value for hex digit " + ch + " is " + ch);
        }

        else {
            System.out.println(ch + " is an invalid input!");
        }
    }
}
