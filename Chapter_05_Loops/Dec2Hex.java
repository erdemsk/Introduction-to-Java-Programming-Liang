/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 5.11 Case Studies, 207*/
import java.util.*;
public class Dec2Hex {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a decimal number
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();

        //Convert decimal to hex
        String hex = "";

        while (decimal != 0){
            //remainders by 16 are hexadecimal digits
            int hexValue = decimal % 16;

            //Convert a decimal value to a hex digit
            char hexDigit = (0 <= hexValue && hexValue <= 9) ?
                    (char) (hexValue + '0') : (char) (hexValue - 10 + 'A');

            //add the new digits to the beginning
            hex = hexDigit + hex;
            decimal = decimal / 16;
        }

        //display the result
        System.out.println("The hex number is " + hex);
    }
}
