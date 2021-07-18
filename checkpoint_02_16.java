/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 2.16 Software Development Process, 85*/
import java.util.*;
public class checkpoint_02_16 {
    public static void main(String[] args) {
        //Creating a Scanner object
        Scanner input = new Scanner(System.in);

        //Asking a,b and c values from the user
        System.out.print("Enter a number for a: ");
        int a = input.nextInt();

        System.out.print("Enter a number for b: ");
        int b = input.nextInt();

        System.out.print("Enter a number for c: ");
        int c = input.nextInt();

        // calculating the formula
        double formula= (-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);

        //displaying the result
        System.out.println(formula);
    }
}
