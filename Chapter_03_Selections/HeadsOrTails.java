/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
3. Programming Exercises 3.14, 132*/
import java.util.*;
public class HeadsOrTails {
    public static void main(String[] args) {
        //Create a random number
        int random = (int) (Math.random()*10);

        // initialize heads as 0, and if the randomly generated number is equal or bigger than 5 turn the heads to 1.
        int heads = 0;
        if (random >= 5){
            heads = 1;
        }

        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to guess
        System.out.print("Enter 1 for Heads or 0 for Tails?: ");
        int guess = input.nextInt();

        //If the input is neither 1 nor 0, prompt an error message
        if (guess != 1 && guess != 0){
            System.out.println("1 or 0!!!");
            System.exit(1);
        }

        //display the result
        if(guess == heads){
            System.out.println("Congratulations! ");
        }
        else {
            System.out.println("Sorry! you should have hit " + heads);
        }
    }
}
