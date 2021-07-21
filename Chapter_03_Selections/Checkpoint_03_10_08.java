/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3.10 Logical Operators, 118*/
import java.util.*;
public class Checkpoint_03_10_08 {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter age
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        boolean boole = age > 13 && age < 18;

        if(boole){
            System.out.println("Age is between 13 and 18");
        }
        else {
            System.out.println("Age is NOT between 13 and 18");
        }
    }
}
