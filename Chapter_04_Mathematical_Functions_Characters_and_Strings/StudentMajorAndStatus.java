/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4. Programming Exercises 4.18, 177*/
import java.util.*;
public class StudentMajorAndStatus {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter two characters that represents their major and class year
        System.out.print("Enter two character: ");
        String majorAndStatus = input.next();

        //Check if the input consists of 2 character and the first one is a letter, and the second one is a number between 1-4
        if (majorAndStatus.length() == 2 && Character.isLetter(majorAndStatus.charAt(0))
            && (1 <= Character.getNumericValue(majorAndStatus.charAt(1))
            && Character.getNumericValue(majorAndStatus.charAt(1)) <= 4)){
            //Display the results
            if (majorAndStatus.charAt(0) == 'I') {
                switch (Character.getNumericValue(majorAndStatus.charAt(1))) {
                    case 1: System.out.println("Information Management Freshman");break;
                    case 2: System.out.println("Information Management Sophomore");break;
                    case 3: System.out.println("Information Management Junior");break;
                    case 4: System.out.println("Information Management Senior");break;
                }
            }
            else if (majorAndStatus.charAt(0) == 'C') {
                switch (Character.getNumericValue(majorAndStatus.charAt(1))) {
                    case 1: System.out.println("Computer Science Freshman");break;
                    case 2: System.out.println("Computer Science Sophomore");break;
                    case 3: System.out.println("Computer Science Junior");break;
                    case 4: System.out.println("Computer Science Senior");break;
                }
            }
            else if (majorAndStatus.charAt(0) == 'A') {
                switch (Character.getNumericValue(majorAndStatus.charAt(1))) {
                    case 1: System.out.println("Accounting Freshman");break;
                    case 2: System.out.println("Accounting Sophomore");break;
                    case 3: System.out.println("Accounting Junior");break;
                    case 4: System.out.println("Accounting Senior");break;
                }
            }
            else {
                System.out.println("Invalid input!");
            }
        }
        else {
            System.out.println("Invalid input!");
        }
    }
}

