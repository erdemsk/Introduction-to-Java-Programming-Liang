/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.5, 259*/
import java.util.*;
public class SortThreeNumbers {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter three integers
        System.out.print("Enter three integers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        //invoke displaySortedNumbers() method
        displaySortedNumbers(num1, num2, num3);
    }

    //sort the numbers in decreasing order
    public static void displaySortedNumbers(double num1, double num2, double num3){
        double temp;

        if (num1 >= num2 && num1 >= num3){
            if (num3 > num2){
                temp = num2;
                num2 = num3;
                num3 = temp;
            }
        }

        else if (num2 >= num1 && num2 >= num3){
            temp = num1;

            if (num1 > num3){
                num1 = num2;
                num2 = temp;
            }

            else {
                num1 = num2;
                num2 = num3;
                num3 = temp;
            }
        }

        else {
            temp = num1;

            if (num1 > num2){
                num1 = num3;
                num3 = num2;
                num2 = temp;
            }

            else {
                num1 = num3;
                num3 = temp;
            }
        }
        //display the sorted numbers
        System.out.println(num1 + " " + num2 + " " + num3);
    }
}
