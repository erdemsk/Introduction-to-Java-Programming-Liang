/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3.10 Logical Operators, 116*/
import java.util.*;
public class TestBooleanOperators {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number % 2 == 0 && number %3 == 0){
            System.out.println((number+" is divisible by 2 and 3"));
        }
        if (number % 2 == 0 || number %3 == 0){
            System.out.println(number+" is divisible by 2 or 3");
        }
        if (number % 2 == 0 ^ number % 3 == 0){
            System.out.println(number+" is divisible by 2 or 3, but not both!");
        }
    }
}
