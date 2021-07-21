/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3. Programming Exercises 3.2, 130*/
import java.util.*;
public class MultiplyThreeNumbers {
    public static void main(String[] args) {

        //Create three numbers
        int numberOne = (int) (System.currentTimeMillis() % 10);
        int numberTwo = (int) (System.currentTimeMillis() / 10 % 10);
        int numberThree = (int) (System.currentTimeMillis() / 100 % 10);

        //Create a Scanner object and ask the user the multiplication of these 3 numbers
        Scanner input = new Scanner(System.in);
        System.out.print("What is ("+numberOne+" x "+numberTwo+" x "+numberThree+") ?: ");
        int answer = input.nextInt();

        int correctAnswer = numberOne * numberTwo * numberThree;

        if(answer == correctAnswer){
            System.out.println("Correct! ("+numberOne+" x "+ numberTwo + " x " + numberThree +") = " +correctAnswer);
        }
        else {
            System.out.println("Wrong! ("+numberOne+" x "+ numberTwo + " x " + numberThree +") = " +correctAnswer);
        }
    }
}
