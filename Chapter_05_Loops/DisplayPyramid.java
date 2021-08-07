/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.17, 218*/
import java.util.*;
public class DisplayPyramid {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter the number of lines
        System.out.print("Enter the number of lines: ");
        int numberOfLines = input.nextInt();

        //to apply numberOfLines
        for (int i = 0; i < numberOfLines; numberOfLines--){
            //to display numbers from numberOfLines to 1
            for (int j = 0; j < numberOfLines; j++){
                System.out.printf("%d ", (numberOfLines - j));
                if (j + 1 == numberOfLines){
                    //to display numbers from 1 to numberOfLines
                    for(int k = 2; k <= numberOfLines; k++){
                        System.out.printf("%d ", k);
                    }
                }
            }
            //move to the next line after every pattern
            System.out.println();
        }

    }
}
