/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.43, 223*/
public class Combinations {
    public static void main(String[] args) {
        final int SUPERIOR_LIMIT = 7;
        final int INFERIOR_LIMIT = 1;
        String combinations;
        int count = 0;

        //determine all the combinations for picking two numbers from 1 to 7
        for (int i = INFERIOR_LIMIT; i < SUPERIOR_LIMIT; i++){
            for (int j = i + 1; j <= SUPERIOR_LIMIT; j++){
                combinations = "" + i + j;
                //display all combinations and increase the total number of combinations
                System.out.println(combinations);
                count++;
            }
        }

        //display the total number of combinations
        System.out.println("The total number of all combinations is " + count);
    }
}
