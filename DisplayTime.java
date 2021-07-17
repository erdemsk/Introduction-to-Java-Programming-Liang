//Introduction to Java Programming and Data Structures, Liang, 11th Edition, 2.9.3 Numeric Operators, 69
import java.util.*;

public class DisplayTime {
    public static void main(String[] args) {
        //create a Scanner object for the input
        Scanner input = new Scanner (System.in);

        //ask input from the user
        System.out.print("Enter an integer for seconds: ");
        int seconds = input.nextInt();

        //calculate minutes in seconds
        int minutes = seconds/60;
        int remainingSeconds = seconds%60; //remaining seconds

        //displaying the result
        System.out.println(seconds+" seconds is: "+minutes+" minutes and "+remainingSeconds+" seconds");
    }
}
