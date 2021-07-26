/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 5.7 The for Loop, 198*/
public class Checkpoint_05_07_06 {
    public static void main(String[] args) {
        //the while loop version
        long sumOfWhile = 0;
        int i = 0;
        while (i <= 1000){
            sumOfWhile += i;
            i++;
        }

        //the do-while loop version
        long sumOfDoWhile = 0;
        int j = 0;
        do {
            sumOfDoWhile += j;
            j++;
        } while (j <= 1000);
    }
}
