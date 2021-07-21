import javax.crypto.spec.PSource;

/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3.14 Conditional Operators, 126*/
public class Checkpoint_03_14_05 {
    public static void main(String[] args) {
        //Create a random between 0 and 10
        int i = (int) (Math.random()*10);

        // If the randomly created number is greater or equal to 5 return -1, if not return 1
        System.out.println((i>=5) ? "-1" : "1");
    }
}
