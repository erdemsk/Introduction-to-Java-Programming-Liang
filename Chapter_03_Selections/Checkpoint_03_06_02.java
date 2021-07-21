/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3.6 Common Errors and Pitfalls, 107*/
import java.util.*;
public class Checkpoint_03_06_02 {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask a number from the user
        System.out.print("Enter a number: ");
        int count = input.nextInt();

        //Test if the count is multiple of 10
        boolean newLine = count % 10 == 0;
        System.out.println(newLine);
    }
}
