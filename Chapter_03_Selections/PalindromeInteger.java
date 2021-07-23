/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3. Programming Exercises 3.12, 132*/
import java.util.*;
public class PalindromeInteger {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a three digit integer
        System.out.print("Enter a three-digit integer: ");
        int palindromeInput = input.nextInt();

        //check if the input is a three-digit integer or not
        if ((palindromeInput > 999) || (palindromeInput < -999)){
            System.out.println("This is NOT a three-digit integer!");
            System.exit(1);
        }

        //keep the original input's value in another variable
        int palindromeCandidate = palindromeInput;

        //separate the digits of the input
        int onesDigit = palindromeCandidate % 10;
        palindromeCandidate /= 10;
        int tensDigit = palindromeCandidate % 10;
        palindromeCandidate /= 10;
        int hundredsDigit = palindromeCandidate % 10;

        if (onesDigit == hundredsDigit){
            System.out.println(palindromeInput + " is a palindrome");
        }
        else {
            System.out.println(palindromeInput + " is NOT a palindrome");
        }
    }
}
