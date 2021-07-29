/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 5.12 Keywords break and continue, 211*/
public class Checkpoint_05_12_02 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        while (i < 4){
            if (i % 3 == 0){
                i++; // if we don't add this statement, the loop is going to keep repeating itself with 3
                continue;
            }
            sum += i;
            i++;
        }
        //display the result
        System.out.println(sum);
    }
}
