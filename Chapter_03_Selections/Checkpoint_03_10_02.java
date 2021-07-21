/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3.10 Logical Operators, 118*/
import java.util.*;
public class Checkpoint_03_10_02 {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        //a
        boolean firstBoole = number >= 1 && number <= 100;
        if (firstBoole){
            System.out.println(number+" is between 1 and 100");
        }
        //b
        boolean secondBoole = (number >= 1 && number <= 100) || (number<0);
        if (secondBoole){
            System.out.println(number+" is between 1 and 100 or negative");
        }
    }
}
