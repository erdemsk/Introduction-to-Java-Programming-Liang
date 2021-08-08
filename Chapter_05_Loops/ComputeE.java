/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.26, 220*/
public class ComputeE {
    public static void main(String[] args) {
        final int SUPERIOR_LIMIT = 100000;
        final int INFERIOR_LIMIT = 2;
        double item = 1;
        double e = 1;
        int j = 10000;

        for (int i = INFERIOR_LIMIT; i <= SUPERIOR_LIMIT; i++){
            //add the 'item' to the 'e', and set the new item as (the previous item / i)
            e += item;
            item = item / i;

            //display the result of the summation for each 10000th step
            while (i % 10000 == 0){
                System.out.println("for i = " + j + ", e value is " + e);
                j += 10000;
                i++;
            }
        }
    }
}
