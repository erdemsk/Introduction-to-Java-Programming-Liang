/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3.7 Generating Random Numbers, 109*/
import java.util.*;
public class SubtractionQuiz {
    public static void main(String[] args) {
        //Create random numbers using Math.random() method and turn them into single-digit integers
        int number1 = (int) (Math.random()*10);
        int number2 = (int) (Math.random()*10);

        //Check if number 2 is greater than number 1, and if so swap their values.
        if(number1<number2){
            int temp=number1; //To swap their values, store the value of number1 in a temporary variable
            number1=number2;
            number2=temp;
        }

        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to the answer of subtraction
        System.out.print("What is "+number1+"-"+number2+"?: ");
        int answer = input.nextInt();

        //Check if the answer is correct or not
        if (answer==number1-number2){
            System.out.println("Correct!");
        }
        else{
            System.out.println("Wrong! The correct answer is: "+ (number1-number2));
        }

    }
}
