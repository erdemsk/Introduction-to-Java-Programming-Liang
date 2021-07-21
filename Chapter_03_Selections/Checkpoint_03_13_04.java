/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3.13 switch Statements, 125*/
import java.util.*;
public class Checkpoint_03_13_04 {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter the number of day
        System.out.print("Enter the number of day: ");
        int day = input.nextInt();

        switch (day%7){
            case 0:  System.out.println("Sunday"); break;
            case 1:  System.out.println("Monday"); break;
            case 2:  System.out.println("Tuesday"); break;
            case 3:  System.out.println("Wednesday"); break;
            case 4:  System.out.println("Thursday"); break;
            case 5:  System.out.println("Friday"); break;
            case 6:  System.out.println("Saturday"); break;
        }
    }
}
