/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3. Programming Exercises 3.3, 131*/
import java.util.*;
public class Solve2x2LinearEquations {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a,b,c,d,e and f
        System.out.print("Enter a, b, c, d, e and f respectively: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        // If (ad - bc) = 0 there will be no solution, check this first
        if (a*d - b*c == 0){
            System.out.println("The equation has no solution!");
        }
        else {
            // if (ad - bc) is not equal to 0, then calculate the x and y using Cramer's rule
            double x = (e * d - b * f) / (a * d - b * c);
            double y = (a * f - e * c) / (a * d - b * c);

            //display the result
            System.out.println("x is "+x+" and y is "+y);
        }
    }
}
