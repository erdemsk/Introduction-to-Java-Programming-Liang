/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.23, 263*/
import java.util.*;
public class OccurrencesOfASpecifiedCharacter {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a string and a character that the user wants to know its' frequency
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.print("Enter a character: ");
        char a = input.nextLine().charAt(0);

        //invoke the count() method to determine how many 'a' occurs in 'str'
        System.out.println("The number of occurrences of '" + a + "' in '" + str + "' is " + count(str, a));
    }

    //declare a method to compare every single character in the string with the character input
    public static int count (String str, char a){
        int numberOfOccurrences = 0;

        //increase the numberOfOccurrences by 1 when encountering with matched characters
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == a){
                numberOfOccurrences++;
            }
        }

        return numberOfOccurrences;
    }
}
