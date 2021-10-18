/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
7. Programming Exercise 7.1, 300 */
import java.util.*;
public class AssignGrades {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        //Ask the user to enter the number of students
        System.out.print("Enter the number of students: ");

        //create a score array
        int[] score = new int[n];

        //create a variable to hold the value of the best score
        int bestScore = 0;

        System.out.print("Enter " + n + " scores: ");

        for (int i = 0; i < score.length; i++) {
            score[i] = input.nextInt();
            //update the bestScore if there is a higher score
            if (bestScore < score[i]) {
                bestScore = score[i];
            }
        }

        // Process grades
        char grade;

        for (int i = 0; i < score.length; i++) {
            if (score[i] >= bestScore - 5){
                grade = 'A';
            }

            else if (score[i] >= bestScore - 10){
                grade = 'B';
            }

            else if (score[i] >= bestScore - 15){
                grade = 'C';
            }

            else if (score[i] >= bestScore - 20){
                grade = 'D';
            }

            else{
                grade = 'F';
            }

            //display the grades of each student
            System.out.println("Student " + i + "'s score is " + score[i] +" and grade is " + grade);
        }
    }
}
