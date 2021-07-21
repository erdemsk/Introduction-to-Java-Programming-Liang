/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 2.11 Evaluating Expressions and Operator Precedence, 73 */
import java.util.*;
public class FahrenheitToCelcius {
    public static void main(String[] args) {

        //Creating a Scanner object
        Scanner input = new Scanner (System.in);

        // Asking a Fahrenheit value from the user
        System.out.println("Enter a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Converting Fahrenheit to Celcius
        double celcius = (5.0/9)*(fahrenheit-32);

        //displaying the result
        System.out.println(fahrenheit+" Fahrenheit is "+celcius+" Celcius");

    }
}
