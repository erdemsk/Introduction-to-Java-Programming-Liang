/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.41, 223*/
import java.util.*;
public class OccurrenceOfMaxNumbers {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        int number, max;

        //Ask the user to enter a number, assign it as max, and initialize the counter with 1
        System.out.print("Enter a number different than 0 and hit 0 to finish: ");
        number = input.nextInt();
        max = number;
        int count = 1;

        //keep asking the user to enter new numbers until the user hits 0
        do {
            System.out.print("Enter a number different than 0 and hit 0 to finish: ");
            number = input.nextInt();

            if (number > max){
                max = number;
                count = 1;
            }
            else if (number == max){
                count++;
            }
        } while (number != 0);

        //display the result
        System.out.println("The largest number is " + max + " and it occurred " + count + " times");
    }
}
