/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.1, 216*/
import java.util.*;
public class PassOrFail {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a score
        System.out.print("Enter your score: ");
        int score = input.nextInt();

        //keep asking new input until the user enters -1
        while (score != -1){
            if (score < 60){
                System.out.println("You don't pass the exam");
            }
            else {
                System.out.println("You pass the exam");
            }
            System.out.print("Enter your score: ");
            score = input.nextInt();
        }

        if (score == -1){
            System.out.println("No numbers are entered except 0");
        }

    }
}
