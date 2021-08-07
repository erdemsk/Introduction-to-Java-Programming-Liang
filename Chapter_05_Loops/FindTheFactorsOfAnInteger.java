/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.16, 218*/
import java.util.*;
public class FindTheFactorsOfAnInteger {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter an integer
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        //if the input is only 1
        if (number == 1){
            System.out.println("1");
        }

        //if the input is greater than 1
        int divider = 2;
        while (divider <= number){
            //print the factors
            if (number % divider == 0){
                System.out.printf("%d, ", divider);
                number /= divider;
            }

            //if the divider is not a factor of number, increase the divider
            else{
                divider++;
            }
        }
    }
}
