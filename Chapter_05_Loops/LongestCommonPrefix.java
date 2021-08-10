/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.51, 226*/
import java.util.*;
public class LongestCommonPrefix {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter two strings
        System.out.print("Enter the first string: ");
        String textOne = input.nextLine();
        System.out.print("Enter the second string: ");
        String textTwo = input.nextLine();

        String prefix = "";

        int mostPossibleIteration = Math.min(textOne.length(), textTwo.length());
        int i = 0;

        while (i < mostPossibleIteration){
            //compare every character between the strings
            if (textOne.charAt(i) == textTwo.charAt(i)){
                prefix = prefix + textOne.charAt(i);
            }

            //if there is an index that characters don't match, exit the loop
            else if (textOne.charAt(i) != textTwo.charAt(i)){
                break;
            }

            i++;
        }

        //display the most common prefix if it exists
        if (prefix.length() != 0){
            System.out.println("The common prefix is " + prefix);
        }

        else {
            System.out.println(textOne + " and " + textTwo + " have no common prefix");
        }

    }
}
