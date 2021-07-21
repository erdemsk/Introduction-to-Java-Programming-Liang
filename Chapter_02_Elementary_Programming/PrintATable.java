/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 2. Programming Exercises 2.18, 95*/
import java.util.*;
public class PrintATable {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask "a" and "b" values from the user
        System.out.print("Enter the x and y coordinates of a (e.g. 5 3): ");
        double xCoordinatesOfFirstA = input.nextDouble();
        double yCoordinatesOfFirstA = input.nextDouble();
        System.out.print("Enter the x and y coordinates of b (e. g. 5 3): ");
        double xCoordinatesOfFirstB = input.nextDouble();
        double yCoordinatesOfFirstB = input.nextDouble();

        System.out.print("Enter the x and y coordinates of a (e.g. 5 3): ");
        double xCoordinatesOfSecondA = input.nextDouble();
        double yCoordinatesOfSecondA = input.nextDouble();
        System.out.print("Enter the x and y coordinates of b (e. g. 5 3): ");
        double xCoordinatesOfSecondB = input.nextDouble();
        double yCoordinatesOfSecondB = input.nextDouble();

        System.out.print("Enter the x and y coordinates of a (e.g. 5 3): ");
        double xCoordinatesOfThirdA = input.nextDouble();
        double yCoordinatesOfThirdA = input.nextDouble();
        System.out.print("Enter the x and y coordinates of b (e. g. 5 3): ");
        double xCoordinatesOfThirdB = input.nextDouble();
        double yCoordinatesOfThirdB = input.nextDouble();

        System.out.print("Enter the x and y coordinates of a (e.g. 5 3): ");
        double xCoordinatesOfFourthA = input.nextDouble();
        double yCoordinatesOfFourthA = input.nextDouble();
        System.out.print("Enter the x and y coordinates of b (e. g. 5 3): ");
        double xCoordinatesOfFourthB = input.nextDouble();
        double yCoordinatesOfFourthB = input.nextDouble();

        System.out.print("Enter the x and y coordinates of a (e.g. 5 3): ");
        double xCoordinatesOfFifthA = input.nextDouble();
        double yCoordinatesOfFifthA = input.nextDouble();
        System.out.print("Enter the x and y coordinates of b (e. g. 5 3): ");
        double xCoordinatesOfFifthB = input.nextDouble();
        double yCoordinatesOfFifthB = input.nextDouble();

        //print the middle points between a and b coordinates
        System.out.println("    a   "+"          b    "+"        Middle Point");
        System.out.print("("+xCoordinatesOfFirstA+","+ yCoordinatesOfFirstA+ ")" +"     "+"("+xCoordinatesOfFirstB+","+yCoordinatesOfFirstB+")"+"    " +"      "+"("+(xCoordinatesOfFirstA+xCoordinatesOfFirstB)/2.0+",");
        System.out.print((yCoordinatesOfFirstA+yCoordinatesOfFirstB)/2.0+")");
        System.out.println();
        System.out.print("("+xCoordinatesOfSecondA+","+ yCoordinatesOfSecondA+ ")" +"     "+"("+xCoordinatesOfSecondB+","+yCoordinatesOfSecondB+")"+"    " +"      "+"("+(xCoordinatesOfSecondA+xCoordinatesOfSecondB)/2.0+",");
        System.out.print((yCoordinatesOfSecondA+yCoordinatesOfSecondB)/2.0+")");
        System.out.println();
        System.out.print("("+xCoordinatesOfThirdA+","+ yCoordinatesOfThirdA+ ")" +"     "+"("+xCoordinatesOfThirdB+","+yCoordinatesOfThirdB+")"+"    " +"      "+"("+(xCoordinatesOfThirdA+xCoordinatesOfThirdB)/2.0+",");
        System.out.print((yCoordinatesOfThirdA+yCoordinatesOfThirdB)/2.0+")");
        System.out.println();
        System.out.print("("+xCoordinatesOfFourthA+","+ yCoordinatesOfFourthA+ ")" +"    "+"("+xCoordinatesOfFourthB+","+yCoordinatesOfFourthB+")"+"    " +"      "+"("+(xCoordinatesOfFourthA+xCoordinatesOfFourthB)/2.0+",");
        System.out.print((yCoordinatesOfFourthA+yCoordinatesOfFourthB)/2.0+")");
        System.out.println();
        System.out.print("("+xCoordinatesOfFifthA+","+ yCoordinatesOfFifthA+ ")" +"   "+"("+xCoordinatesOfFifthB+","+yCoordinatesOfFifthB+")"+"    " +"      "+"("+(xCoordinatesOfFifthA+xCoordinatesOfFifthB)/2.0+",");
        System.out.print((yCoordinatesOfFifthA+yCoordinatesOfFifthB)/2.0+")");

    }
}
