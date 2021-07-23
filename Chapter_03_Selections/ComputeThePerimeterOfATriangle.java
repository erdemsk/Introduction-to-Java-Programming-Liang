/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
3. Programming Exercises 3.19, 133*/
import java.util.*;
public class ComputeThePerimeterOfATriangle {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter the length of each edge of the triangle
        System.out.print("Enter the length of edges: ");
        double edge1 = input.nextDouble();
        double edge2 = input.nextDouble();
        double edge3 = input.nextDouble();

        if (edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1){
            double perimeterOfTriangle = edge1 + edge2 + edge3;
            System.out.println("The perimeter of the triangle is "+ perimeterOfTriangle);
        }
        else {
            System.out.println("Invalid input! The sum of every pair of two edges must be greater " +
                    "than the remaining edge.");
        }

    }
}
