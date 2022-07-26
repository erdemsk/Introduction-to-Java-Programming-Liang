/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
12.2 Exception Handling, 480*/
import java.util.*;
public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do{
            try{
                System.out.print("Enter an integer: ");
                int number = input.nextInt();

                //display the result
                System.out.println("The number entered is: " + number);

                continueInput = false;
            }
            catch (InputMismatchException ex){
                System.out.println("Try again. (" +
                        "Incorrect input: an integer is required)");
                input.nextLine();
            }
        } while (continueInput);
    }
}
