/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.23, 220*/
public class DemonstrateCancellationErrors {
    public static void main(String[] args) {
        final int N = 50000;
        double sumFromLeftToRight = 0;
        double sumFromRightToLeft = 0;
        int j = 10000;

        //compute the summation from left to right
        for (int i = 1; i <= N; i++){
            sumFromLeftToRight += 1 / i;

            //display the result of the summation for each 10000th step
            while (i % 10000 == 0){
                System.out.println(j + ". summation from left to right is " + sumFromLeftToRight);
                j += 10000;
                i++;
            }
        }

        j = 10000;
        //compute the summation from right to left
        for (int i = N; i >= 1; i--){
            sumFromRightToLeft += 1 / i;

            //display the result of the summation for each 10000th step
            while (i % 10000 == 0){
                System.out.println(j + ". summation from right to left is " + sumFromRightToLeft);
                j += 10000;
                i--;
            }
        }

        //display the final result
        System.out.printf("Summation from left to right: %f\nSummation from right to left: %f", sumFromLeftToRight, sumFromRightToLeft);
    }
}
