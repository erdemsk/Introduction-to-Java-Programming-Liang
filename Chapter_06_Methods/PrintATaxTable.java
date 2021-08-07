/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.15, 261*/
public class PrintATaxTable {
    public static void main(String[] args) {
        final int INCOME_INFERIOR_LIMIT = 50000;
        final int INCOME_SUPERIOR_LIMIT = 70000;
        //display the header
        System.out.printf("%-20s %-20s %-20s %-20s %-20s\n" +
                "%-41s %-20s %-20s %-20s\n" +
                "%-41s %-20s\n" +
                "-----------------------------------------------------------------------------------------------\n",
                "Taxable", "Single", "Married Joint", "Married", "Head of", "Income", "or Qualifying", "Separate",
                "a House", " ", "Widow(er)");
            for (double i = INCOME_INFERIOR_LIMIT; i <= INCOME_SUPERIOR_LIMIT; i += 100){
                //display the taxable income
                System.out.printf("%-20d ", (int) i);
                //display the tax amount for every filing status
                for (int j = 0; j < 4; j++){
                    System.out.printf("%-20d ", Math.round(computeTax(j, i)));
                }
                //move to the next line after displaying the tax amount for every filing status
                System.out.println();
        }
    }

    //define the computeTax() method
    public static double computeTax(int status, double taxableIncome){
        //define the tax rates
        final double FIRST_TAX_BRACKET = 0.1;
        final double SECOND_TAX_BRACKET = 0.15;
        final double THIRD_TAX_BRACKET = 0.25;
        final double FOURTH_TAX_BRACKET = 0.28;
        final double FIFTH_TAX_BRACKET = 0.33;
        final double SIXTH_TAX_BRACKET = 0.35;
        double tax = 0;

        //define the inferior and superior limits of tax brackets for each filing status and set the rules to compute taxes
        if (status == 0){
            if (taxableIncome <= 8350.00){
                tax = taxableIncome * FIRST_TAX_BRACKET;
            }

            else if (taxableIncome > 8350.00 && taxableIncome <= 33950.00){
                tax = 8350 * FIRST_TAX_BRACKET + (taxableIncome - 8350) * SECOND_TAX_BRACKET;
            }

            else if (taxableIncome > 33951.00 && taxableIncome <= 82250.00){
                tax = 8350 * FIRST_TAX_BRACKET + (33950 - 8350) * SECOND_TAX_BRACKET + (taxableIncome - 33950) * THIRD_TAX_BRACKET;
            }

            else if (taxableIncome > 82251.00 && taxableIncome <= 171550.00){
                tax = 8350 * FIRST_TAX_BRACKET + (33950 - 8350) * SECOND_TAX_BRACKET + (82250 - 33950) * THIRD_TAX_BRACKET + (taxableIncome - 82250) * FOURTH_TAX_BRACKET;
            }

            else if (taxableIncome > 171551.00 && taxableIncome <= 372950.00){
                tax = 8350 * FIRST_TAX_BRACKET + (33950 - 8350) * SECOND_TAX_BRACKET + (82250 - 33950) * THIRD_TAX_BRACKET + (171550 - 82250) * FOURTH_TAX_BRACKET + (taxableIncome - 171550) * FIFTH_TAX_BRACKET;
            }

            else {
                tax = 8350 * FIRST_TAX_BRACKET + (33950 - 8350) * SECOND_TAX_BRACKET + (82250 - 33950) * THIRD_TAX_BRACKET + (171550 - 82250) * FOURTH_TAX_BRACKET + (372950 - 171550) * FIFTH_TAX_BRACKET + (taxableIncome - 372950) * SIXTH_TAX_BRACKET;
            }
        }

        else if (status == 1){
            if (taxableIncome <= 16700.00){
                tax = taxableIncome * FIRST_TAX_BRACKET;
            }

            else if (taxableIncome >= 16701.00 && taxableIncome <= 67900.00){
                tax = 16700.00 * FIRST_TAX_BRACKET + (taxableIncome - 16701.00) * SECOND_TAX_BRACKET;
            }

            else if (taxableIncome >= 67900.00 && taxableIncome <= 137050.00){
                tax = 16700.00 * FIRST_TAX_BRACKET + (67900.00 - 16701.00) * SECOND_TAX_BRACKET + (taxableIncome - 67901.00) * THIRD_TAX_BRACKET;
            }

            else if (taxableIncome >= 137051.00 && taxableIncome <= 208850.00){
                tax = 16700.00 * FIRST_TAX_BRACKET + (67900.00 - 16701.00) * SECOND_TAX_BRACKET + (137050.00 - 67901.00) * THIRD_TAX_BRACKET + (taxableIncome - 137051.00) * FOURTH_TAX_BRACKET;
            }

            else if (taxableIncome >= 208851.00 && taxableIncome <= 372950.00){
                tax = 16700.00 * FIRST_TAX_BRACKET + (67900.00 - 16701.00) * SECOND_TAX_BRACKET + (137050.00 - 67901.00) * THIRD_TAX_BRACKET + (208850.00 - 137051.00) * FOURTH_TAX_BRACKET + (taxableIncome - 208851.00) * FIFTH_TAX_BRACKET;
            }

            else {
                tax = 16700.00 * FIRST_TAX_BRACKET + (67900.00 - 16701.00) * SECOND_TAX_BRACKET + (137050.00 - 67901.00) * THIRD_TAX_BRACKET + (208850.00 - 137051.00) * FOURTH_TAX_BRACKET + (372950.00 - 208851.00) * FIFTH_TAX_BRACKET + (taxableIncome - 372951.00) * SIXTH_TAX_BRACKET;
            }
        }

        else if (status == 2){
            if (taxableIncome <= 8350.00){
                tax = taxableIncome * FIRST_TAX_BRACKET;
            }

            else if (taxableIncome >= 8351.00 && taxableIncome <= 33950.00){
                tax = 8350.00 * FIRST_TAX_BRACKET + (taxableIncome - 8351.00) * SECOND_TAX_BRACKET;
            }

            else if (taxableIncome >= 33951.00 && taxableIncome <= 68525.00){
                tax = 8350.00 * FIRST_TAX_BRACKET + (33950.00 - 8351.00) * SECOND_TAX_BRACKET + (taxableIncome - 33951.00) * THIRD_TAX_BRACKET;
            }

            else if (taxableIncome >= 68526.00 && taxableIncome <= 104425.00){
                tax = 8350.00 * FIRST_TAX_BRACKET + (33950.00 - 8351.00) * SECOND_TAX_BRACKET + (68525.00 - 33951.00) * THIRD_TAX_BRACKET + (taxableIncome - 68526.00) * FOURTH_TAX_BRACKET;
            }

            else if (taxableIncome >= 104426.00 && taxableIncome <= 186475){
                tax = 8350.00 * FIRST_TAX_BRACKET + (33950.00 - 8351.00) * SECOND_TAX_BRACKET + (68525.00 - 33951.00) * THIRD_TAX_BRACKET + (104425.00 - 68526.00) * FOURTH_TAX_BRACKET + (taxableIncome - 104426.00) * FIFTH_TAX_BRACKET;
            }

            else {
                tax = 8350.00 * FIRST_TAX_BRACKET + (33950.00 - 8351.00) * SECOND_TAX_BRACKET + (68525.00 - 33951.00) * THIRD_TAX_BRACKET + (104425.00 - 68526.00) * FOURTH_TAX_BRACKET + (186475.00 - 104426.00) * FIFTH_TAX_BRACKET + (taxableIncome - 186476.00) * SIXTH_TAX_BRACKET;
            }
        }

        else if (status == 3){
            if (taxableIncome <= 11950.00){
                tax = taxableIncome * FIRST_TAX_BRACKET;
            }

            else if (taxableIncome > 11950.00 && taxableIncome <= 45500.00){
                tax = 11950.00 * FIRST_TAX_BRACKET + (taxableIncome - 11950.00) * SECOND_TAX_BRACKET;
            }

            else if (taxableIncome > 45501.00 && taxableIncome <= 117450.00){
                tax = 11950.00 * FIRST_TAX_BRACKET + (45500.00 - 11950.00) * SECOND_TAX_BRACKET + (taxableIncome - 45500.00) * THIRD_TAX_BRACKET;
            }

            else if (taxableIncome > 117451.00 && taxableIncome <= 190200.00){
                tax = 11950.00 * FIRST_TAX_BRACKET + (45500.00 - 11950.00) * SECOND_TAX_BRACKET + (117450.00 - 45500.00) * THIRD_TAX_BRACKET + (taxableIncome - 117450.00) * FOURTH_TAX_BRACKET;
            }

            else if (taxableIncome > 190201.00 && taxableIncome <= 372950.00){
                tax = 11950.00 * FIRST_TAX_BRACKET + (45500.00 - 11950.00) * SECOND_TAX_BRACKET + (117450.00 - 45500.00) * THIRD_TAX_BRACKET + (190200.00 - 117450.00) * FOURTH_TAX_BRACKET + (taxableIncome - 190200.00) * FIFTH_TAX_BRACKET;
            }

            else {
                tax = 11950.00 * FIRST_TAX_BRACKET + (45500.00 - 11950.00) * SECOND_TAX_BRACKET + (117450.00 - 45500.00) * THIRD_TAX_BRACKET + (190200.00 - 117450.00) * FOURTH_TAX_BRACKET + (372950.00 - 190200.00) * FIFTH_TAX_BRACKET + (taxableIncome - 372950.00) * SIXTH_TAX_BRACKET;
            }
        }

        else {
            System.out.println("Wrong status!");
            System.exit(1);
        }

        //return the tax amount
        return tax;
    }
}
