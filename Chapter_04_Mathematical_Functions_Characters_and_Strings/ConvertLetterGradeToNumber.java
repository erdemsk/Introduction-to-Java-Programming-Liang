/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4. Programming Exercises 4.14, 176*/
import java.util.*;
public class ConvertLetterGradeToNumber {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a letter grade
        System.out.print("Enter a letter grade: ");
        String letterString = input.nextLine();
        char letterGrade = letterString.charAt(0);

        //If the letter is not consist of A, B, C, D or F return an error message.
        if(letterGrade != 'A' && letterGrade != 'B' && letterGrade != 'C' && letterGrade != 'D' && letterGrade != 'F'){
            System.out.println(letterGrade + " is an invalid grade!");
            System.exit(1);
        }

        //Display the result
        if (letterGrade == 'A'){
            System.out.println("The numeric value for grade " + letterGrade + " is 4");
        }
        else if (letterGrade == 'B'){
            System.out.println("The numeric value for grade " + letterGrade + " is 3");
        }
        else if (letterGrade == 'C'){
            System.out.println("The numeric value for grade " + letterGrade + " is 2");
        }
        else if (letterGrade == 'D'){
            System.out.println("The numeric value for grade " + letterGrade + " is 1");
        }
        else{
            System.out.println("The numeric value for grade " + letterGrade + " is 0");
        }
    }
}
