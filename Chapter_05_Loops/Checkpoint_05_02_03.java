/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 5.2 The while Loop , 185*/
public class Checkpoint_05_02_03 {
    public static void main(String[] args) {
        //initialize integer x with 80000000
        int x = 80000000;
        //increment x by 1 when x is greater than 0
        while (x > 0){
            x++;
        }
        //display the result, the reason behind this result is "overflow". 80000000 is too large to store in an int variable.
        System.out.println("x is " + x);
    }
}
