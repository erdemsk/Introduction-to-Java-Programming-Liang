/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 5.5 Controlling a Loop with User Confirmation or a Sentinel Value , 192*/
import java.util.*;
public class Checkpoint_05_05_01 {
    public static void main(String[] args) {
        int number, max;

        //Create a Scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Enter");
        number = input.nextInt();
        max = number;

        while (number != 0){
            number = input.nextInt();
            if (number > max){
                max = number;
            }
        }
        System.out.println("Max is " + max);
        System.out.println("Number is " + number);
        /* This program is only useful to detect the greatest number among the inputs, number variable is
        always going to be 0 because it is the condition of terminating the loop and having an output. It also lacks
        of clear guide to the user, since there is no prompt message as "Enter a number" but this is intentionally
        designed to grip of updating variables logically (not like "number" variable)
        and importance of clear user guidance.
         */
    }
}
