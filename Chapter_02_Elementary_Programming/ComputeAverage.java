//Introduction to Java Programming and Data Structures, Liang, 11th Edition, 2.3 Reading Input from the Console, 60-61
import java.util.Scanner; //Necessary for creating a Scanner object, Scanner is in the java.util package

public class ComputeAverage {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Ask the user to enter three numbers
        System.out.println("Enter three numbers: ");

        //reading the numbers
        double numberOne=input.nextDouble();
        double numberTwo=input.nextDouble();
        double numberThree=input.nextDouble();

        //computing the average of given numbers
        double average = (numberOne+numberTwo+numberThree)/3;

        //Display the result
        System.out.println("The average of "+numberOne+", "+numberTwo+", and "+numberThree+" is: "+average);

    }

}
