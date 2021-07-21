/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3.5 Nested if and Multi-Way if-else Statements, 105*/
import java.util.*;
public class Checkpoint_03_05_03 {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user the score
        System.out.print("Enter the score: ");
        int score = input.nextInt();

        if (score >= 60){
            System.out.println("D");
        }
        else if (score>=70){
            System.out.println("C");
        }
        else if (score>=80){
            System.out.println("B");
        }
        else if (score>=90){
            System.out.println("A");
        }
        else {
            System.out.println("F");
        }
        /* All else-if blocks are dysfunctional. If the score is greater than 60,
        then if block will be executed before any of the else-if blocks.
        So, there is only two possible outputs of this code block: (1)D (2)F */
    }
}
