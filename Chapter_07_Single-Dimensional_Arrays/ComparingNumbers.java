/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
7. Programming Exercise 7.2, 300 */
import java.util.*;
public class ComparingNumbers {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);
        int[] number = new int[11];

        //Ask the user to enter 11 integers
        System.out.print("Enter 11 integers: ");

        for (int i = 0; i < number.length; i++){
            number[i] = input.nextInt();
        }

        //Compare every integer with 11th integer and display if it is greater, equal or smaller than the last integer.
        for (int i = 0; i < number.length - 1; i++){
            if (number[i] > number[number.length - 1]){
                System.out.printf("%d is greater than %d\n", number[i], number[number.length - 1]);
            }

            else if (number[i] == number[number.length - 1]){
                System.out.printf("%d is equal to %d\n", number[i], number[number.length - 1]);
            }

            else{
                System.out.printf("%d is smaller than %d\n", number[i], number[number.length - 1]);
            }
        }
    }
}
