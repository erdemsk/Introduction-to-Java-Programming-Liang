/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4. Programming Exercises 4.23, 179*/
import java.util.*;
public class Payroll {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user following questions
        System.out.print("Enter employee's name: ");
        String employeeName = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        double numberOfWorkHours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double hourlyPay = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTaxRate = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTaxRate = input.nextDouble();

        double grossPay = numberOfWorkHours * hourlyPay;

        //display the result
        System.out.printf("\nEmployee name: %s ", employeeName);
        System.out.printf("\nHours worked: %.2f ", numberOfWorkHours);
        System.out.printf("\nPay rate: $%.2f", hourlyPay);
        System.out.printf("\nGross pay: $%.2f", grossPay);
        System.out.printf("\nDeductions:");
        System.out.printf("\n     Federal withholding (%%20.0): $%.2f ", (grossPay * federalTaxRate));
        System.out.printf("\n     State withholding (%%9.0): $%.2f ", (grossPay * stateTaxRate));
        System.out.printf("\n     Total Deduction: $%.2f", grossPay * (federalTaxRate + stateTaxRate));
        System.out.printf("\n     Net pay: $%.2f",grossPay - grossPay * (federalTaxRate + stateTaxRate));
    }
}
