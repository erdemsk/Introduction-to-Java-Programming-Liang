/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.6, 259*/
import java.util.*;
public class DisplayPatterns {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        //invoke the displayPattern() method
        displayPattern(number);
    }

    /*define the displayPattern() method by keep increasing the counting in a row, until n-th row
    and after the n-th row display the numbers in reverse order once*/
    public static void displayPattern(int n){
        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = n; i >= n; i--){
            for(int j = n; j >= 1; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
