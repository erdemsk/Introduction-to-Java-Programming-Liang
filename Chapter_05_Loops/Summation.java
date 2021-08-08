/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.35, 222*/
public class Summation {
    public static void main(String[] args) {
        final int INFERIOR_LIMIT = 1;
        final int SUPERIOR_LIMIT = 999;

        double sum = 0;

        //compute the summation
        for (int i = INFERIOR_LIMIT; i <= SUPERIOR_LIMIT; i++){
            sum += 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
            System.out.println(sum);
        }

        //display the result
        System.out.println("The sum is " + sum);
    }
}
