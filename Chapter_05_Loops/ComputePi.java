/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.25, 220*/
public class ComputePi {
    public static void main(String[] args) {
        final int SUPERIOR_LIMIT = 100000;
        final int INFERIOR_LIMIT = 1;
        double pi = 0;
        int i = 10000;

        for (int j = INFERIOR_LIMIT; j <= SUPERIOR_LIMIT; j++){
            //compute pi
            pi = pi + 4 * (Math.pow(-1, j + 1) / (2 * j - 1));

            //display the result of the summation for each 10000th step
            while (j % 10000 == 0){
                System.out.println("for i = " + i + ", pi is " + pi);
                i += 10000;
                j++;
            }
        }
    }
}
