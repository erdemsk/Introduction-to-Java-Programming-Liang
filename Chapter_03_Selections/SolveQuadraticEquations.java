/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3. Programming Exercises 3.1, 130*/
import java.util.*;
public class SolveQuadraticEquations {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a,b and c respectively: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        //compute the discriminant
        double discriminant = Math.pow(b,2) - 4 * a * c;
        double rootFirst, rootSecond;

        if (discriminant >= 0){
            if (discriminant == 0){
                rootFirst = (int) ((-b + Math.sqrt(discriminant))/(2*a)*1000000)/1000000.0;
                rootSecond=rootFirst;
                System.out.println("The equation has one root "+rootFirst);
            }
            else {
                rootFirst = (int) ((-b + Math.sqrt(discriminant))/(2*a)*1000000)/1000000.0;
                rootSecond = (int) ((-b - Math.sqrt(discriminant))/(2*a)*1000000)/1000000.0;
                System.out.println("The equation has two roots "+rootFirst+" and "+rootSecond);
            }
        }
        else {
            System.out.println("The equation has no real roots!");
        }

    }
}
