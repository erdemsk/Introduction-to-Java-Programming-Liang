/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3.14 Conditional Operators, 126*/
import java.util.*;
public class Checkpoint_03_14_03 {
    public static void main(String[] args) {
        // (a)
        int score = 0;
        int scale = 2;

        //Create a Scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = input.nextInt();

        // if number is greater than 10, assign 3*scale to score, if not assign 4*scale to score
        if (x>10){
            score = 3 * scale;
        }
        else {
            score = 4 * scale;
        }
        System.out.println(score);

        // (b)
        double tax = 0;
        System.out.println("Enter your income: ");
        double income = input.nextDouble();

        //if income is greater than 10000, assign income*0.2 to tax, if not assign income*0.17+1000 to tax
        if (income > 10000){
            tax = income * 0.2;
        }
        else {
            tax = income * 0.17 + 1000;
        }
        System.out.print("Tax is: "+tax);

        // (c)
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int i = 1;
        int j = 0;

        // if number is a multiple of 3 return i, if not return j
        if (number % 3 == 0){
            System.out.println(i);
        }
        else {
            System.out.println(j);
        }
    }
}
