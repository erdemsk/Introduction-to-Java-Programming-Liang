/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4. Programming Exercises 4.21, 178*/
import java.util.*;
public class CheckSSN {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a Social Security Number in the Format DDD-DD-DDDD where D is a digit.
        System.out.print("Enter a SSN: ");
        String ssn = input.next();

        //Check if the given SSN is valid or not
        if (ssn.charAt(3) == '-' && ssn.charAt(6) == '-' &&
        Character.isDigit(ssn.charAt(0)) && Character.isDigit(ssn.charAt(1)) && Character.isDigit(ssn.charAt(2))
        && Character.isDigit(ssn.charAt(4)) && Character.isDigit(ssn.charAt(5))
        && Character.isDigit(ssn.charAt(7)) && Character.isDigit(ssn.charAt(8))
        && Character.isDigit(ssn.charAt(9)) && Character.isDigit(ssn.charAt(10))){
            System.out.println(ssn + " is a valid social security number.");
        }
        else {
            System.out.println(ssn + " is an invalid social security number.");
        }
    }
}
