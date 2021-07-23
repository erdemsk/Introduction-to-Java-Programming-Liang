/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
3. Programming Exercises 3.17, 133*/
import java.util.*;
public class ScissorRockPaper {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a number for rock, paper and scissor
        System.out.print("scissor (0), rock (1), paper (2): ");
        int usersChoice = input.nextInt();

        //If the input is something different than 0, 1 or 2 then prompt an error message
        if (usersChoice != 0 && usersChoice != 1 && usersChoice != 2){
            System.out.println("0, 1 or 2!!!");
            System.exit(1);
        }

        //Create a random number between 0-2
        int computersChoice = (int) (Math.random()*3);

        if (computersChoice == usersChoice){
            if (computersChoice == 0){
                System.out.println("The computer is scissor. You are scissor too. It is a draw!");
            }
            else if (computersChoice == 1){
                System.out.println("The computer is rock. You are rock too. It is a draw!");
            }
            else {
                System.out.println("The computer is paper. You are paper too. It is a draw!");
            }
        }
        else if (computersChoice == 0 && usersChoice == 1){
            System.out.println("The computer is scissor. You are rock. You won!");
        }
        else if (computersChoice == 0 && usersChoice == 2){
            System.out.println("The computer is scissor. You are paper. Computer won!");
        }
        else if (computersChoice == 1 && usersChoice == 0){
            System.out.println("The computer is rock. You are scissor. Computer won!");
        }
        else if (computersChoice == 1 && usersChoice == 2){
            System.out.println("The computer is rock. You are paper. You won!");
        }
        else if (computersChoice == 2 && usersChoice == 0){
            System.out.println("The computer is paper. You are scissor. You won!");
        }
        else {
            System.out.println("The computer is paper. You are rock. Computer won!");
        }
    }
}
