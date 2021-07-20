/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 2. Programming Exercises 2.20, 96*/
import java.util.*;
public class CalculateInterest {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user to enter balance and interest rates
        System.out.print("Enter the balance: ");
        double balance= input.nextDouble();

        System.out.print("Enter the interest rate: ");
        double annualInteresRate = input.nextDouble();

        //calculate the interest
        double interest = (int) (balance * (annualInteresRate/1200)*100000)/100000.0;

        //display the result
        System.out.println("The interest is "+interest);
    }
}
