/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 5.11 Case Studies, 208*/
import java.util.Scanner;
public class Checkpoint_05_11_05 {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a decimal number
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();

        //create a String object to display hex value
        String hex = "";

        //Convert decimal to hex
        while (decimal != 0){
            //remainders by 16 are hexadecimal digits
            int hexValue = decimal % 16;

            //Convert a decimal value to a hex digit
            char hexDigit = (0 <= hexValue && hexValue <= 9) ?
                    (char) (hexValue + '0') : (char) (hexValue - 10 + 'A');

            //add the new digits to the beginning of hex variable
            hex = hexDigit + hex;
            decimal = decimal / 16;
        }

        /*display the result (if the input is 0, hex (line 26) will be an empty string.
        To avoid this, define an output scenario for the input 0*/
        System.out.println("The hex number is " + (hex.length() == 0 ? '0' : hex));
    }
}
