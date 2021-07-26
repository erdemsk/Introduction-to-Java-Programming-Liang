/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 5.7 The for Loop, 197*/
import java.util.*;
public class Checkpoint_05_07_01 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; ++i){
            sum += i;
        }
        System.out.println("The sum of the for loop with ++i -> " + sum);

        sum = 0;
        for (int i = 0; i < 10; i++){
            sum += i;
        }
        System.out.println("The sum of the for loop with i++ --> " + sum);
    }
}
