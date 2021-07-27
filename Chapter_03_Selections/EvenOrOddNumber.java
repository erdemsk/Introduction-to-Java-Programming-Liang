/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
3. Programming Exercises 3.35, 140*/
import java.util.*;
public class EvenOrOddNumber {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        //check if the number is divisible by 2 without a remainder and display the result
        if (number % 2 == 0){
            System.out.println(number + " is even number");
        }
        else {
            System.out.println(number + " is odd number");
        }
    }
}
