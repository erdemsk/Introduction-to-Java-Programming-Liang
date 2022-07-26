/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
12.2 Exception Handling, 477*/
import java.util.Scanner;
public class QuotientWithIf {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user to enter two integers
        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        if(number2 != 0){
            System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));
        } else{
            System.out.println("Divisor cannot be zero!");
        }
    }
}
