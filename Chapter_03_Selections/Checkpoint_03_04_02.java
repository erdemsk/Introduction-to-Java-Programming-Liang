/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3.4 Two-Way if-else Statements, 103*/
import java.util.*;
public class Checkpoint_03_04_02 {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user to enter a number
        System.out.print("30 or 35?: ");
        int number = input.nextInt();

        System.out.println("a:");
        if (number%2==0){
            System.out.println(number + " is even.");
        }
        System.out.println(number + " is odd");

        System.out.println("b: ");
        if (number%2==0){
            System.out.println(number + " is even.");
        }
        else {
            System.out.println(number + " is odd.");
        }
    }
}
