/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.34, 222*/
import java.util.*;
public class ScissorRockPaper {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        // initialize score variables
        int userPoint = 0;
        int computerPoint = 0;

        //declare the computer's choice
        int computer;

        //continue the game as long as the difference does not reach three
        while (Math.abs(userPoint - computerPoint) < 3){
            //assign a random number between 0, 1 and 2 to the computer
            computer = (int) (Math.random() * 3);

            //ask the user to make a choice between scissor, rock and paper
            System.out.print("scissor (0), rock (1), paper (2): ");
            int user = input.nextInt();

            //if there is a draw
            if (computer == user){
                switch (computer){
                    case 0: System.out.println("The computer is scissor, you're scissor too! It is a draw!"); break;
                    case 1: System.out.println("The computer is rock, you're rock too! It is a draw!"); break;
                    case 2: System.out.println("The computer is paper, you're paper too! It is a draw!"); break;
                }
                System.out.println("-> Computer " + computerPoint + " - " + userPoint + " You\n");
            }

            //if the user wins
            else if ((user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2 && computer == 1)){
                switch (user){
                    case 0: System.out.println("\nThe computer is paper, you're scissor. You won!"); break;
                    case 1: System.out.println("\nThe computer is scissor, you're rock. You won!"); break;
                    case 2: System.out.println("\nThe computer is rock, you're paper. You won!"); break;
                }
                userPoint++;
                System.out.println("-> Computer " + computerPoint + " - " + userPoint + " You\n");
            }

            //if the computer wins
            else if ((computer == 0 && user == 2) || (computer == 1 && user == 0) || (computer == 2 && user == 1)){
                switch (computer){
                    case 0: System.out.println("\nThe computer is scissor, you're paper. Computer won!"); break;
                    case 1: System.out.println("\nThe computer is rock, you're scissor. Computer won!"); break;
                    case 2: System.out.println("\nThe computer is paper, you're rock. Computer won!"); break;
                }
                computerPoint++;
                System.out.println("-> Computer " + computerPoint + " - " + userPoint + " You\n");
            }

            //for invalid inputs
            else {
                System.out.println("Invalid input!");
                continue;
            }
        }

        //display the winner
        if (userPoint > computerPoint){
            System.out.println("Congratulations! You won!");
        }
        else {
            System.out.println("Computer won, maybe next time!");
        }
    }
}
