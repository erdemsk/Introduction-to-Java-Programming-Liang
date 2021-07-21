/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3.13 switch Statements, 125*/
import java.util.*;
public class Checkpoint_03_13_05 {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a year
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        //determine the zodiac sign
        if (year % 12 == 0){
            System.out.println("monkey");
        }
        else if (year % 12 == 1){
            System.out.println("rooster");
        }
        else if (year % 12 == 2){
            System.out.println("dog");
        }
        else if (year % 12 == 3){
            System.out.println("pig");
        }
        else if (year % 12 == 4){
            System.out.println("rat");
        }
        else if (year % 12 == 5){
            System.out.println("ox");
        }
        else if (year % 12 == 6){
            System.out.println("tiger");
        }
        else if (year % 12 == 7){
            System.out.println("rabbit");
        }
        else if (year % 12 == 8){
            System.out.println("dragon");
        }
        else if (year % 12 == 9){
            System.out.println("snake");
        }
        else if (year % 12 == 10){
            System.out.println("horse");
        }
        else {
            System.out.println("sheep");
        }
    }
}
