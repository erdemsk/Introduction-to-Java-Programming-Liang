/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 5.12 Keywords break and continue, 210-211*/
public class Checkpoint_05_12_01 {
    public static void main(String[] args) {
        //a
        int balance = 10;
        while (true){
            if (balance < 9){
                break;
            }
            balance = balance - 9;
        }
        System.out.println("Balance is " + balance);

        //b
        /*while (true){
            if (balance < 9){
                continue;
            }
            balance = balance - 9;
        }*/
        //Program in the b won't terminate so the following statement will never get executed
        System.out.println("Balance is " + balance);
    }
}
