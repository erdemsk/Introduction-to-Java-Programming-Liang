/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3.10 Logical Operators, 118*/
import java.util.*;
public class Checkpoint_03_10_03 {
    public static void main(String[] args) {

        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a number
        System.out.print("Enter a number: ");
        double number = input.nextDouble();

        //a
        boolean firstBoole = Math.abs(number-5)<4.5; //Math.abs(x) method can be used to return the absolute value of x
        if (firstBoole){
            System.out.println(number+" - 5 is less than 4.5");
        }

        //b
        boolean secondBoole = Math.abs(number-5)>4.5;
        if (secondBoole){
            System.out.println(number+" - 5 is greater than 4.5");
        }
    }
}
