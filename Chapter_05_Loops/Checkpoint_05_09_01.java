/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 5.9 Nested Loops, 201*/
public class Checkpoint_05_09_01 {
    public static void main(String[] args) {
        //initialize a counter variable
        int numberOfExecution = 0;
        //for loop
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < i; j++){
                System.out.println(i * j);
                numberOfExecution++;
            }
        }
        //display how many times the println statement was executed
        System.out.println("println statement executed " + numberOfExecution + " times");
    }
}
