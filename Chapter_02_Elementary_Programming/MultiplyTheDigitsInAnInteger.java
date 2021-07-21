/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 2. Programming Exercises 2.6, 92*/
import java.util.*;
public class MultiplyTheDigitsInAnInteger {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user a number
        System.out.print("Enter a number between 100 and 1000: ");
        int number = input.nextInt();

        //seperate units, tens and hundreds digits
        int unitsDigit = number%10; //seperate units digit
        int tensAndHundredsDigit= number/10; //extract units digit and leave only hundreds digit and tens digit
        int tensDigit = tensAndHundredsDigit%10; //seperate tens digit
        int hundredsDigit= tensAndHundredsDigit/10; //seperate hundreds digit

        //computing the multiplication of digits
        int multiplication = unitsDigit*tensDigit*hundredsDigit;
        System.out.println("The multiplication of all digits in "+number+" is "+multiplication);
    }
}
