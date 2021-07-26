/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 5.6 The do-while Loop, 195*/
import java.util.*;
public class Checkpoint_05_06_02 {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);
        //declare a number variable and initialize a sum variable
        int number;
        int sum = 0;

        //keep asking input until the user hits 0
        do {
            System.out.print("Enter an integer " +
                    "(the input ends if it is 0): ");
            number = input.nextInt();
            sum += number;
        } while (number != 0);

        //display the result when the user hits 0
        System.out.println("The sum is " + sum);
    }
}
