/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4. Programming Exercises 4.11, 175*/
import java.util.*;
public class BinaryToDecimal {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a binary number
        System.out.print("Enter binary digits (0000 to 1111): ");
        String binary = input.nextLine();
        int decimal = 0;

        if (binary.charAt(0) == '1'){
            decimal += 8;
        }
        if (binary.charAt(1) == '1'){
            decimal += 4;
        }
        if (binary.charAt(2) == '1'){
            decimal += 2;
        }
        if (binary.charAt(3) == '1'){
            decimal += 1;
        }

        //display the result
        System.out.println("The decimal value is " + decimal);

    }
}
