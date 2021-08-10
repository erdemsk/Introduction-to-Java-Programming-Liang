/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.50, 226*/
import java.util.*;
public class PrintMultiplicationTable {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a string
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        for (int i = 1; i < 10; i++){
            for (int j = 1; j < 10; j++){
                System.out.printf("%d * %d = %d\t", j, i, i * j);
            }
            System.out.println();
        }

    }
}
