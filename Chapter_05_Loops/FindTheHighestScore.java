/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.8, 217*/
import java.util.*;
public class FindTheHighestScore {
    public static void main(String[] args) {
        byte maxScore = 0;
        String bestStudent = "";

        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter the number of students
        System.out.print("Enter the number of students: ");
        byte numberOfStudents = input.nextByte();

        //Ask the user to enter each student's name and score
        for (int i = 0; i < numberOfStudents; i++){
            System.out.print("Enter the students name and score: ");
            String nameOfStudent = input.next();
            byte scoreOfStudent = input.nextByte();

            //update the last student if necessary
            if (scoreOfStudent > maxScore){
                maxScore = scoreOfStudent;
                bestStudent = nameOfStudent;
            }
            else if (scoreOfStudent == maxScore){
                bestStudent += ", " + nameOfStudent;
            }
        }
        //display the result
        System.out.print("The student(s) that has the highest score is " + bestStudent);
    }
}
