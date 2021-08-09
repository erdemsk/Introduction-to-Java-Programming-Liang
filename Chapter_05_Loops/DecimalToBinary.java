/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.37, 222*/
import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a decimal value
        System.out.print("Enter a decimal value: ");
        int decimal = input.nextInt();

        String binary = "";
        String binaryDigit;

        /*find the remainder by 2, add it to the binary representation and divide the decimal by 2 until
        it becomes 0*/
        while (decimal != 0){
            binaryDigit = "" + decimal % 2;
            binary = binaryDigit + binary;
            decimal /= 2;
        }

        //display the result
        System.out.println("Binary representation is " + binary);
    }
}
