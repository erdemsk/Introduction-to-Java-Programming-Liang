/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4.4 The String Type, 157*/
import java.util.*;
public class OrderTwoCities {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter two cities
        System.out.print("Enter a city: ");
        String cityOne = input.nextLine();
        System.out.print("Enter another city: ");
        String cityTwo = input.nextLine();

        // Compare cities in alphabetical order by compareTo() method.
        if (cityOne.compareTo(cityTwo) < 0){
            System.out.println("The cities in alphabetical order are: " + cityOne + ", " + cityTwo);
        }
        else {
            System.out.println("The cities in alphabetical order are: " + cityTwo + ", " + cityOne);
        }
    }
}
