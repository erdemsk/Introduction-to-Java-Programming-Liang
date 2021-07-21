/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3.3 if Statements, 102*/
import java.util.*;
public class Checkpoint_03_03_02 {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user the score
        System.out.print("Enter the score: ");
        int score = input.nextInt();

        // a random value for the pay
        int pay = 100;

        // increase the pay by 3% if score is greater than 90
        if (score>90){
            pay=pay*103/100;
            System.out.println(pay);
        }
    }
}
