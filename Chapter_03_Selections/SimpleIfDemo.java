/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3.3 if Statements, 101*/
import java.util.*;
public class SimpleIfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number%5==0){
            System.out.println("HiFive");
        }
        if (number%2==0){
            System.out.println("HiEven");
        }
    }
}
