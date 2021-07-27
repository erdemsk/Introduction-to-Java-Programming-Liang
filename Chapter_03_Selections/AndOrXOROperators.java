/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
3. Programming Exercises 3.26, 136*/
import java.util.*;
public class AndOrXOROperators {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        //check if it is divisible by 4 and 5 with &&, || and ^ operators and express the mean of these operators.
        System.out.println("Is " + number + " divisible by 4 and 5? " + (number % 4 == 0 && number % 5 ==0));
        System.out.println("Is " + number + " divisible by 4 or 5? " + (number % 4 == 0 || number % 5 ==0));
        System.out.println("Is " + number + " divisible by 4 or 5 but not both? "
                + (number % 4 == 0 ^ number % 5 ==0));
    }
}
