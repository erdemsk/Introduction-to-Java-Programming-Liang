/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3.10 Logical Operators, 118*/
import java.util.*;
public class Checkpoint_03_10_06 {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a number
        System.out.print("Enter a number ");
        int x = input.nextInt();

        // Check if the value is between 50 and 100. If it is the following statement will get evaluated as true.
        boolean boole = x >= 50 && x <= 100;

        //display the result
        if (boole){
            System.out.println("Number is greater than or equal to 50 but less than or equal to 100");
        }
        else{
            System.out.println("Number is NOT greater than or equal to 50 or NOT less than or equal to 100");
        }
    }
}
