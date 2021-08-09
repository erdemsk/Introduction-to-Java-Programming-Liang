/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.38, 222*/
import java.util.*;
public class DecimalToOctal {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a decimal value
        System.out.print("Enter a decimal value: ");
        int decimal = input.nextInt();

        String octal = "";
        String octalDigit;

        /*find the remainder by 8, add it to the octal representation and divide the decimal by 8 until
        it becomes 0*/
        while (decimal != 0){
            octalDigit = "" + decimal % 8;
            octal = octalDigit + octal;
            decimal /= 8;
        }

        //display the result
        System.out.println("Octal representation is " + octal);
    }
}
