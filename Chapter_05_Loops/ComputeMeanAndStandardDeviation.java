/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.45, 224*/
import java.util.*;
public class ComputeMeanAndStandardDeviation {
    public static void main(String[] args) {
        final int NUMBER_OF_ENTRY = 10;
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //initialize the variables to hold the sum of numbers, and sum of squares of the numbers
        double sum = 0;
        double sumSquare = 0;

        //Ask the user to enter 10 numbers
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < NUMBER_OF_ENTRY; i++){
            double number = input.nextDouble();
            sum += number;
            sumSquare += Math.pow(number, 2);
        }

        //compute the mean and standard deviation values
        double mean = sum / NUMBER_OF_ENTRY;
        double standardDeviation =
                Math.sqrt((sumSquare - Math.pow(sum, 2) / NUMBER_OF_ENTRY) / (NUMBER_OF_ENTRY - 1));

        //display the result
        System.out.printf("The mean is: %.2f\nThe standard deviation is: %.5f", mean, standardDeviation);
    }
}
