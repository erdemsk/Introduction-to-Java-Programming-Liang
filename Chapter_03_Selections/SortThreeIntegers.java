/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3. Programming Exercises 3.8, 132*/
import java.util.*;
public class SortThreeIntegers {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner (System.in);

        //Ask the user to enter three integers
        System.out.print("Enter three integers: ");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();

        // initialize a temp variable to hold a variable's value when swapping their places.
        int temp = 0;

        // rearrange the variables to be firstNumber > secondNumber > thirdNumber
        if (firstNumber > secondNumber && firstNumber > thirdNumber){
            if (thirdNumber > secondNumber){
                temp = secondNumber;
                secondNumber = thirdNumber;
                thirdNumber = temp;
            }
            // No need to an else block if firstNumber > secondNumber > thirdNumber
        }
        else if (secondNumber > firstNumber && secondNumber > thirdNumber){
            if (firstNumber > thirdNumber){
                temp = firstNumber;
                firstNumber = secondNumber;
                secondNumber = temp;
            }
            else {
                temp = firstNumber;
                firstNumber=secondNumber;
                secondNumber=thirdNumber;
                thirdNumber = temp;
            }
        }
        else{
            if (secondNumber > firstNumber){
                temp = firstNumber;
                firstNumber = thirdNumber;
                thirdNumber = temp;
            }
            else {
                temp = firstNumber;
                firstNumber = thirdNumber;
                thirdNumber = secondNumber;
                secondNumber = temp;
            }
        }
        //display the result
        System.out.println(thirdNumber+", "+secondNumber+", "+firstNumber);
    }
}
