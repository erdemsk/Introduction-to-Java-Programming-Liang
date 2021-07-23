/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
3. Programming Exercises 3.13, 132*/
import java.util.*;
public class ComputeTaxes {
    public static void main(String[] args) {
        //calculations based on the 2009 U.S. Federal Personal Tax Rates

        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user to enter the filing status
        System.out.print("0-single filer, 1-married jointly or qualifying widow(er),\n" +
                "2-married separately, 3-head of household)\n" +
                "Enter the filing status: ");
        int filingStatus = input.nextInt();

        //Ask the user to enter taxable income
        System.out.print("Enter your taxable income: $");
        double taxableIncome = input.nextDouble();

        //define the tax brackets
        double firstTaxBracket = 10/100.0;
        double secondTaxBracket = 15/100.0;
        double thirdTaxBracket = 25/100.0;
        double fourthTaxBracket = 28/100.0;
        double fifthTaxBracket = 33/100.0;
        double sixthTaxBracket = 35/100.0;

        //initialize the tax amount
        double tax=0;

        if (filingStatus==0){
            if (taxableIncome<=8350){
                tax = taxableIncome * firstTaxBracket;
            }
            else if (taxableIncome<=33950){
                tax = 8350 * firstTaxBracket + (taxableIncome-8350) * secondTaxBracket;
            }
            else if (taxableIncome<=82250){
                tax = 8350 * firstTaxBracket + (33950-8350) * secondTaxBracket + (taxableIncome-33950) * thirdTaxBracket;
            }
            else if (taxableIncome<=171550){
                tax = 8350 * firstTaxBracket + (33950-8350) * secondTaxBracket + (82250-33950) * thirdTaxBracket + (taxableIncome-82250) * fourthTaxBracket;
            }
            else if (taxableIncome<=372950){
                tax = 8350 * firstTaxBracket + (33950-8350) * secondTaxBracket + (82250-33950) * thirdTaxBracket + (171550-82250) * fourthTaxBracket + (taxableIncome-171550) * fifthTaxBracket;
            }
            else {
                tax = 8350 * firstTaxBracket + (33950-8350) * secondTaxBracket + (82250-33950) * thirdTaxBracket + (171550-82250) * fourthTaxBracket + (372950-171550) * fifthTaxBracket + (taxableIncome-372950) * sixthTaxBracket;
            }
        }

        else if (filingStatus==1){
            if (taxableIncome<=16700){
                tax = taxableIncome * firstTaxBracket;
            }
            else if (taxableIncome<=67900){
                tax = 16700 * firstTaxBracket + (taxableIncome-16700) * secondTaxBracket;
            }
            else if (taxableIncome<=137050){
                tax = 16700 * firstTaxBracket + (67900-16700) * secondTaxBracket + (taxableIncome-67900) * thirdTaxBracket;
            }
            else if (taxableIncome<=208850){
                tax = 16700 * firstTaxBracket + (67900-16700) * secondTaxBracket + (137050-67900) * thirdTaxBracket + (taxableIncome-137050) * fourthTaxBracket;
            }
            else if (taxableIncome<=372950){
                tax = 16700 * firstTaxBracket + (67900-16700) * secondTaxBracket + (137050-67900) * thirdTaxBracket + (208850-137050) * fourthTaxBracket + (taxableIncome-208850) * fifthTaxBracket;
            }
            else {
                tax = 16700 * firstTaxBracket + (67900-16700) * secondTaxBracket + (137050-67900) * thirdTaxBracket + (208850-137050) * fourthTaxBracket + (372950-208850) * fifthTaxBracket + (taxableIncome-372950) * sixthTaxBracket;
            }
        }

        else if (filingStatus==2){
            if (taxableIncome<=8530){
                tax = taxableIncome * firstTaxBracket;
            }
            else if (taxableIncome<=33950){
                tax = 8350 * firstTaxBracket + (taxableIncome-8350) * secondTaxBracket;
            }
            else if (taxableIncome<=68525){
                tax = 8350 * firstTaxBracket + (33950-8350) * secondTaxBracket + (taxableIncome-33950) * thirdTaxBracket;
            }
            else if (taxableIncome<=171550){
                tax = 8350 * firstTaxBracket + (33950-8350) * secondTaxBracket + (68525-33950) * thirdTaxBracket + (taxableIncome-68525) * fourthTaxBracket;
            }
            else if (taxableIncome<=372950){
                tax = 8350 * firstTaxBracket + (33950-8350) * secondTaxBracket + (68525-33950) * thirdTaxBracket + (104425-68525) * fourthTaxBracket + (taxableIncome-104425) * fifthTaxBracket;
            }
            else {
                tax = 8350 * firstTaxBracket + (33950-8350) * secondTaxBracket + (68525-33950) * thirdTaxBracket + (104425-68525) * fourthTaxBracket + (186475-104425) * fifthTaxBracket + (taxableIncome-186475) * sixthTaxBracket;
            }
        }

        else if (filingStatus==3){
            if (taxableIncome<=11950){
                tax = taxableIncome * firstTaxBracket;
            }
            else if (taxableIncome<=45500){
                tax = 11950 * firstTaxBracket + (taxableIncome-11950) * secondTaxBracket;
            }
            else if (taxableIncome<=117450){
                tax = 11950 * firstTaxBracket + (45500-11950) * secondTaxBracket + (taxableIncome-45500) * thirdTaxBracket;
            }
            else if (taxableIncome<=190200){
                tax = 11950 * firstTaxBracket + (45500-11950) * secondTaxBracket + (117450-45500) * thirdTaxBracket + (taxableIncome-117450) * fourthTaxBracket;
            }
            else if (taxableIncome<=372950){
                tax = 11950 * firstTaxBracket + (45500-11950) * secondTaxBracket + (117450-45500) * thirdTaxBracket + (190200-117450) * fourthTaxBracket + (taxableIncome-190200) * fifthTaxBracket;
            }
            else {
                tax = 11950 * firstTaxBracket + (45500-11950) * secondTaxBracket + (117450-45500) * thirdTaxBracket + (190200-117450) * fourthTaxBracket + (372950-190200) * fifthTaxBracket + (taxableIncome-372950) * sixthTaxBracket;
            }
        }

        else {
            System.out.println("Wrong status!");
            System.exit(1);
        }

        //display the result
        System.out.println("Tax is "+(int)(tax*100)/100.0);
    }
}
