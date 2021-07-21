/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3.4 Two-Way if-else Statements, 103*/
import java.util.*;
public class Checkpoint_03_04_01 {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //declare and initialize "pay"
        int pay = 100;

        //ask user to enter the score
        System.out.print("Enter the score: ");
        int score = input.nextInt();

        if (score > 90){
            pay= pay*103/100;
            System.out.println(pay);
        }
        else {
            pay= pay*101/100;
            System.out.println(pay);
        }
    }
}
