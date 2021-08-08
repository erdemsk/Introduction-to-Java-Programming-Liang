/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.24, 220*/
public class SumASeries {
    public static void main(String[] args) {
        final int SUPERIOR_LIMIT = 97;
        final int INFERIOR_LIMIT = 1;

        //compute the summation
        double sum = 0;
        for (double i = SUPERIOR_LIMIT; i >= INFERIOR_LIMIT; i -= 2){
            sum = sum + i / (i + 2);
        }

        //display the result
        System.out.println("The sum is " + sum);
    }
}
