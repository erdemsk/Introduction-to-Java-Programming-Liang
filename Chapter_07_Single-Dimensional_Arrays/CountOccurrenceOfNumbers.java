/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
7. Programming Exercise 7.3, 301 */
import java.util.*;
public class CountOccurrenceOfNumbers {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[0];
        int number;

        //Ask the user to enter integers from 1 to 100
        System.out.print("Enter the integers between 1 and 100: ");

        // Get inputs from the user and increase the size of the array, until the user sends 0
        while ((number = input.nextInt()) != 0) {
            numbers = addToArray(numbers, number);
        }

        int searchNumber = 0, searchCount = 0;

        //loop through the array
        for (int j = 0; j < numbers.length; j++) {
            // Define new search term if needed
            if (searchNumber != numbers[j] && numbers[j] != 0) {
                searchNumber = numbers[j];

                for (int i = j; i < numbers.length; i++) {
                    if (searchNumber == numbers[i]) {
                        searchCount++;
                        numbers[i] = 0;
                    }
                }

                System.out.print(searchNumber + " occurs " + searchCount
                        + " time");
                if (searchCount > 1) {
                    System.out.println("s");
                } else {
                    System.out.println();
                }

                searchCount = 0;
            }
        }
    }

    public static boolean copyArray(int[] source, int[] dest) {
        if (source.length > dest.length){
            return false;
        }

        System.arraycopy(source, 0, dest, 0, source.length);
        return true;
    }

    public static int[] addToArray(int[] source, int data) {
        int[] dest = new int[source.length + 1];
        copyArray(source, dest);
        dest[source.length] = data;
        return dest;
    }
}
