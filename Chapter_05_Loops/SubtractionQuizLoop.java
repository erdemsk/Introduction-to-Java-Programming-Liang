/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 5.4 Loop Design Strategies, 188*/
import java.util.*;
public class SubtractionQuizLoop {
    public static void main(String[] args) {
        //Define a constant for number of questions
        final int NUMBER_OF_QUESTIONS = 5;

        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //initialize counter and correctAnswers variables
        int count = 0;
        int correctAnswers = 0;
        long startTime = System.currentTimeMillis(); //to detect how long did test take
        String output = ""; //intentionally left blank

        //Ask 5 subtraction questions to the user
        while (count < NUMBER_OF_QUESTIONS){
            //Generate two random number
            int number1 = (int) (Math.random()*10);
            int number2 = (int) (Math.random()*10);

            // if number2 is greater than number1, swap their values
            if (number1 < number2){
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            //Ask the user the difference between numbers
            System.out.print("What is " + number1 + " - " + number2 + " ? = ");
            int answer = input.nextInt();
            // if the answer is correct, increment the correctAnswers by 1
            if (answer == number1 - number2){
                System.out.println("You are correct!");
                correctAnswers++;
            }
            //if the answer is wrong, display the true answer
            else {
                System.out.println("Wrong. \n" + number1 + " - " + number2 + " should be " + (number1 - number2));
            }
            //Increase the counter
            count++;

            //add every question and is it properly answered or not to the (String) output variable
            output += "\n" + number1 + " - " + number2 + " = " + answer
                    + ((number1 - number2 == answer) ? " correct" : " wrong");
        }

        //calculate the test time
        long endTime = System.currentTimeMillis();
        long testTime = (endTime - startTime) / 1000;

        //display the result
        System.out.println("\nNumber of correct answers is: " + correctAnswers + "\nTest time is " + testTime
        + " seconds\n" + output);
    }
}
