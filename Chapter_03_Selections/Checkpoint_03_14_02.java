/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3.14 Conditional Operators, 126*/
import java.util.*;
public class Checkpoint_03_14_02 {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter age
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        int ticketPrice = 0;
        System.out.print("Ticket price is: ");
        System.out.println(ticketPrice = (age >= 16) ? 20 : 10);
    }

}
