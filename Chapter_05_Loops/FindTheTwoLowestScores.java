/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.9, 217*/
import java.util.*;
public class FindTheTwoLowestScores {
    public static void main(String[] args) {
        byte lowestScore = 100;
        byte secondLowestScore = 100;
        String lastStudent = "";
        String secondLastStudent = "";

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

            //update the least score and second least score if necessary
            if (scoreOfStudent < lowestScore){
                secondLowestScore = lowestScore;
                secondLastStudent = lastStudent;
                lowestScore = scoreOfStudent;
                lastStudent = nameOfStudent;
            }
            else if (scoreOfStudent == lowestScore){
                lastStudent += ", " + nameOfStudent;
            }
            else if (scoreOfStudent < secondLowestScore){
                secondLowestScore = scoreOfStudent;
                secondLastStudent = nameOfStudent;
            }
            else if (scoreOfStudent == secondLowestScore){
                secondLastStudent += ", " + nameOfStudent;
            }
        }
        //display the result
        System.out.printf("The student that has the lowest score is %s and the student(s) " +
                "that has the second-lowest score is %s", lastStudent, secondLastStudent);
    }
}
