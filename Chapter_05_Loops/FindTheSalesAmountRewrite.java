/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.42, 223*/
import java.util.*;
public class FindTheSalesAmountRewrite {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter their earnings target and commission rates
        System.out.print("Enter your earnings target: $");
        double earningsGoal = input.nextDouble();

        System.out.print("Enter the commission rate for sales between $0.01 - $5,000: %");
        double firstCommissionRate = input.nextDouble() / 100;
        System.out.print("Enter the commission rate for sales between $5,000.01 - $10,000: %");
        double secondCommissionRate = input.nextDouble() / 100;
        System.out.print("Enter the commission rate for sales $10,000.01 and above: %");
        double thirdCommissionRate = input.nextDouble() / 100;

        int baseSalary = 5000;
        double salesAmount = 0;
        double commission;
        double totalEarnings = 0;

        //compute the commission earnings for different sales amounts until the total earnings reach to the goal
        while (totalEarnings != earningsGoal){
            //increase the sales amount
            salesAmount++;

            if (salesAmount <= 5000){
                commission = salesAmount * firstCommissionRate;
            }

            else if (salesAmount <= 10000){
                commission = 5000 * firstCommissionRate + (salesAmount - 5000) * secondCommissionRate;
            }

            else {
                commission = 5000 * firstCommissionRate + 5000 * secondCommissionRate + (salesAmount - 10000) * thirdCommissionRate;
            }

            //compute the total earnings
            totalEarnings = baseSalary + commission;
        }

        //display the result
        System.out.println("To earn $" + earningsGoal + ", you should make sales that worth $" + salesAmount);
    }
}
