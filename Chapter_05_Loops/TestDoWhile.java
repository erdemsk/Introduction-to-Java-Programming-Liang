/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 5.6 The do-while Loop, 193-194*/
import java.util.Scanner;

public class TestDoWhile {
    public static void main(String[] args) {
        int data;
        int sum = 0;

        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Keep reading data until the input is 0
        do{
            System.out.print("Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();
            sum += data;
        } while (data != 0);

        //display the result when user hits 0
        System.out.println("The sum is " + sum);
    }
}
