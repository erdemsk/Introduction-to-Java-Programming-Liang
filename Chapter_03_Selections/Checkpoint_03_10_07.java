/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3.10 Logical Operators, 118*/
import java.util.*;
public class Checkpoint_03_10_07 {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number for for x, y and z respectively: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();

        System.out.println("(x < y && y < z) is "+(x < y && y < z));
        System.out.println("(x < y || y < z) is "+(x < y || y < z));
        System.out.println("!(x<y) is "+!(x<y));
        System.out.println("(x + y < z) is "+(x + y < z));
        System.out.println("(x + y > z) is "+(x + y > z));
    }
}
