/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 5.5 Controlling a Loop with User Confirmation or a Sentinel Value , 190-191*/
import java.util.*;
public class SentinelValue {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter an integer
        System.out.print("Enter an integer (the input ends if it is 0): ");
        int data = input.nextInt();

        //initialize the sum variable, add data to sum if the input is not 0 and keep prompting until the user hits 0
        int sum = 0;
        while (data != 0){
            sum += data;
            System.out.print("Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();
        }

        //display the result
        System.out.println("The sum is " + sum);
    }
}
