/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3.14 Conditional Operators, 126*/
import java.util.*;
public class Checkpoint_03_14_01 {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter values for x, y and z respectively
        System.out.print("Enter the values of x, y and z respectively: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();

        System.out.println((x<y && y<z) ? "sorted" : "not sorted");
    }
}
