/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3.10 Logical Operators, 118*/
import java.util.*;
public class Checkpoint_03_10_05 {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        //Compare the results of two different statements in (a) and (b)
        System.out.println("(a): "+(number % 2 == 0 && number % 3 == 0));
        System.out.println("(b): "+(number % 6 == 0));
    }
}
