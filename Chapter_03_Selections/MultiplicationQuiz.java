/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3. Programming Exercises 3.10, 132*/
import java.util.*;
public class MultiplicationQuiz {
        public static void main(String[] args) {
            //Create random numbers using Math.random() method and turn them into integers that are less than 1000.
            int number1 = (int) (Math.random()*1000);
            int number2 = (int) (Math.random()*1000);

            //Create a Scanner object
            Scanner input = new Scanner(System.in);

            //Ask the user to the answer of multiplication
            System.out.print("What is "+number1+" x "+number2+"?: ");
            int answer = input.nextInt();

            //Check if the answer is correct or not
            if (answer == number1 * number2){
                System.out.println("Correct!");
            }
            else{
                System.out.println("Wrong! The correct answer is: "+ (number1 * number2));
            }
        }
    }

