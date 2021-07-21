/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 2. Programming Exercises 2.13, 93-94*/
import java.util.*;
public class CompoundValue {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user monthly saving amount
        System.out.print("Enter the monthly savings: $");
        double savings = input.nextDouble();

        double annualInterestRate=3.75/100;
        double monthlyInterestRate= annualInterestRate/12;
        double amountAfterFirstMonth = savings*(1+monthlyInterestRate);
        double amountAfterSecondMonth = (savings + amountAfterFirstMonth)*(1+monthlyInterestRate);
        double amountAfterThirdMonth = (savings + amountAfterSecondMonth)*(1+monthlyInterestRate);
        double amountAfterFourthMonth = (savings+amountAfterThirdMonth)*(1+monthlyInterestRate);
        double amountAfterFifthMonth = (savings+amountAfterFourthMonth)*(1+monthlyInterestRate);
        double amountAfterSixthMonth = (savings+amountAfterFifthMonth)*(1+monthlyInterestRate);

        System.out.println("After the first month, the account value is: $"+amountAfterFirstMonth);
        System.out.println("After the second month, the account value is: $"+amountAfterSecondMonth);
        System.out.println("After the third month, the account value is: $"+amountAfterThirdMonth);
        System.out.println("After the six month, the account value is: $"+amountAfterSixthMonth);

    }
}
