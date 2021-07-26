/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 5.6 The do-while Loop, 194*/
import java.util.*;
public class Checkpoint_05_06_01 {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        int number, max;
        number = input.nextInt();
        max = number;

        do{
            number = input.nextInt();
            if (number > max){
                max = number;
            }
        } while (number != 0);

        //display the result
        System.out.println("max is " + max);
        System.out.println("number " + number);

        //Rewrite of Checkpoint 05_05_01
        /* This program is only useful to detect the greatest number among the inputs, number variable is
        always going to be 0 because it is the condition of terminating the loop and having an output. It also lacks
        of clear guide to the user, since there is no prompt message as "Enter a number" but this is intentionally
        designed to grip of updating variables logically (not like "number" variable)
        and importance of clear user guidance. */
    }
}
