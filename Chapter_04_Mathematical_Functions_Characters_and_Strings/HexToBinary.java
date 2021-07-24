/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4. Programming Exercises 4.12, 176*/
import java.util.*;
public class HexToBinary {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a hex digit
        System.out.print("Enter a hex digit: ");
        String s = input.nextLine();
        //for invalid inputs which contain more than a character
        if (s.length() > 1){
            System.out.println("Invalid input!");
            System.exit(1);
        }

        //hold the value in a char variable
        char ch = s.charAt(0);

        //for invalid character inputs which are neither digits nor letters between A-F
        if (('0' <= ch && ch <= '9') ^ ('A' <= ch && ch <= 'F')){
            if ('0' <= ch && ch <= '9'){
                int hexDigitNumber = (int) ch;
                switch (ch){
                    case 48: System.out.println("The binary value is 0000"); break;
                    case 49: System.out.println("The binary value is 0001"); break;
                    case 50: System.out.println("The binary value is 0010"); break;
                    case 51: System.out.println("The binary value is 0011"); break;
                    case 52: System.out.println("The binary value is 0100"); break;
                    case 53: System.out.println("The binary value is 0101"); break;
                    case 54: System.out.println("The binary value is 0110"); break;
                    case 55: System.out.println("The binary value is 0111"); break;
                    case 56: System.out.println("The binary value is 1000"); break;
                    case 57: System.out.println("The binary value is 1001"); break;
                }
            }

            else if ('A' <= ch && ch <= 'F'){
                int hexDigitNumber = (int) ch;
                switch (hexDigitNumber){
                    case 65: System.out.println("The binary value is 1010"); break;
                    case 66: System.out.println("The binary value is 1011"); break;
                    case 67: System.out.println("The binary value is 1100"); break;
                    case 68: System.out.println("The binary value is 1101"); break;
                    case 69: System.out.println("The binary value is 1110"); break;
                    case 70: System.out.println("The binary value is 1111"); break;
                }
            }
        }

        else{
            System.out.println("Invalid input!");
            System.exit(1);
        }
    }
}
