/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6.6 Modularizing Code, 242*/
import java.util.*;
public class Hex2Dec {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a hex number
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();

        System.out.printf("The decimal number for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
    }
    //define the hexToDecimal() method
    public static int hexToDecimal (String hex){
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++){
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }
    //define the hexCharToDecimal() method
    public static int hexCharToDecimal (char ch){
        if (ch >= 'A' && ch <= 'F'){
            return 10 + ch - 'A';
        }
        else { //ch is 0, 1, ... 9
            return ch - '0';
        }
    }
}
