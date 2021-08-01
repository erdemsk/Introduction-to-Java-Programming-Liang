/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.7, 217*/
public class ComputeFutureTuition {
    public static void main(String[] args) {
        byte years = 0 ;
        final byte YEARS = 14;
        double tuition = 10000;
        double tuitionIncrease = 0.06;
        double cost = 0;

        //Increase the tuition amount by 6% every year
        for (; years < 10; years++){
            tuition = tuition + tuition * tuitionIncrease;
        }

        //Display the result
        System.out.printf("The tuition amount 10 years later: $%,.2f", tuition);

        /*Add the tuition amount starting from 11th year to the cost and increase the tuition
        by 6% every year from 11th to 14th year*/
        for (; years < YEARS; years++){
            tuition += tuition * tuitionIncrease;
            cost += tuition;
        }

        //Display the result
        System.out.printf("\nThe total cost of 4 years' worth of tuition after the 10th year: $%,.2f", cost);
    }
}
