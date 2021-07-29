/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 5.13 Case Study: Checking Palindromes, 212*/
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a string
        System.out.print("Enter a string: ");
        String palindromeCandidate = input.next();

        //The index of the first character in the string
        int low = 0;
        //The index of the last character in the string
        int high = palindromeCandidate.length() - 1;

        //Create a boolean statement and set as true to investigate if the word is palindrome or not
        boolean isPalindrome = true;

        /*Compare the characters at the two ends of the string, increment the low and decrement the high
        to keep comparing every character. This process is going to last until low >= high or a mismatch is found.
        If there is a mismatch, the word is not a palindrome and the break statement terminates the loop.
        If low becomes greater than or equal to high then the word is a palindrome.*/
        while (low < high){
            if (palindromeCandidate.charAt(low) != palindromeCandidate.charAt(high)){
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }

        //display the result
        if (isPalindrome){
            System.out.println(palindromeCandidate + " is a palindrome");
        }
        else{
            System.out.println(palindromeCandidate + " is NOT a palindrome");
        }
    }
}
