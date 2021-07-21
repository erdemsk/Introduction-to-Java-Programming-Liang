/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3.5 Nested if and Multi-Way if-else Statements, 105*/
import java.util.*;
public class Checkpoint_03_05_01 {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask x and y values from the user
        System.out.print("Enter a value for x: ");
        int x = input.nextInt();
        System.out.print("Enter a value for y: ");
        int y = input.nextInt();

        if (x>2){
            if (y>2){
                int z = x + y;
                System.out.println("z is "+z);
            }
        else {
                System.out.println("x is "+x);
            }
        }
    }
}
