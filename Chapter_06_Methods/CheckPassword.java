/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.18, 262*/
import java.util.*;
public class CheckPassword {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a password
        System.out.print("Enter a password: ");
        String password = input.next();

        //invoke the passwordValidation() method
        if (passwordValidation(password)) {
            System.out.println("Valid password");
        }
        else {
            System.out.println("Invalid password");
        }
    }

    public static boolean passwordValidation(String password) {
        //initialize an isValid variable and a counter to detect the number of digits in the password
        boolean isValid = true;
        int numberOfDigits = 0;

        //check if the password containts at least 10 characters
        if (password.length() < 10) {
            isValid = false;
        }

        else{
            for (int i = 0; i < password.length(); i++){
                //check if all the characters in the password are digits or letters
                if (Character.isLetterOrDigit(password.charAt(i))){

                    //increase the counter by 1, when met with a digit in the password
                    if (Character.isDigit(password.charAt(i))){
                        numberOfDigits++;
                    }
                }

                //if the password contains any other character than a letter or a digit
                else{
                    isValid = false;
                    break;
                }
            }
        }

        /*if the password has more than 10 characters which consists of letters and digits but it contains less
        than 3 digits*/
        if (numberOfDigits < 3){
            isValid = false;
        }

        //return the boolean variable
        return isValid;
    }
}