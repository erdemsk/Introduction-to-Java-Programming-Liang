/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.39, 223*/
import java.util.*;
public class FindTheSalesAmount {
    public static void main(String[] args) {
        final double FIRST_COMMISSION_RATE = 0.06;
        final double SECOND_COMMISSION_RATE = 0.08;
        final double THIRD_COMMISSION_RATE = 0.1;

        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter their earnings target
        System.out.print("Enter your earnings target: $");
        double earningsGoal = input.nextDouble();

        int baseSalary = 5000;
        double salesAmount = 0;
        double commission;
        double totalEarnings;

        //compute the commission earnings for different sales amounts until the total earnings reach to the goal
        do {
            //increase the sales amount
            salesAmount++;

            if (salesAmount <= 5000){
                commission = salesAmount * FIRST_COMMISSION_RATE;
            }

            else if (salesAmount <= 10000){
                commission = 5000 * FIRST_COMMISSION_RATE + (salesAmount - 5000) * SECOND_COMMISSION_RATE;
            }

            else {
                commission = 5000 * FIRST_COMMISSION_RATE + 5000 * SECOND_COMMISSION_RATE
                        + (salesAmount - 10000) * THIRD_COMMISSION_RATE;
            }

            //compute the total earnings
            totalEarnings = baseSalary + commission;
        } while (totalEarnings != earningsGoal);

        //display the result
        System.out.println("To earn $" + earningsGoal + ", you should make sales that worth $" + salesAmount);
    }
}
