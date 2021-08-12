/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.17, 262*/
import java.util.*;
public class DisplayMatrixOf0sAnd1s {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a number
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        //display the n x n matrix by invoking the printMatrix() method
        printMatrix(n);
    }

    public static void printMatrix (int n){
        for (int rowCounter = 0; rowCounter < n; rowCounter++){
            for (int itemsCounter= 0; itemsCounter < n; itemsCounter++){
                //create a random number between 0 and 1 as items of the matrix
                System.out.print((int) (Math.random() * 2) + " ");
            }
            //move to the next row
            System.out.println();
        }
    }
}
