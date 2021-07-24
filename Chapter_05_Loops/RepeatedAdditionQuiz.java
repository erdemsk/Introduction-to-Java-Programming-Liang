/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 5.2 The while Loop , 184*/
import java.util.*;
public class RepeatedAdditionQuiz {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Generate two random numbers
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        //Ask the user for the sum of these numbers
        System.out.print("What is " + number1 + " + " + number2 + " = ? ");
        int answer = input.nextInt();

        //If the answer is wrong keep asking the question again
        while (number1 + number2 != answer){
            System.out.print("Wrong answer! Try again, what is " + number1 + " + " + number2 + " = ? ");
            answer = input.nextInt();
        }

        //if the answer is correct, display the result
        System.out.println("Correct! " + number1 + " + " + number2 + " = " + answer);
    }
}
