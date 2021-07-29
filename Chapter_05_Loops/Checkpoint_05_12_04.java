/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 5.12 Keywords break and continue, 211*/
public class Checkpoint_05_12_04 {
    public static void main(String[] args) {
        // (a)
        for (int i = 1; i < 4; i++){
            for (int j = 1; j < 4; j++){
                if (i * j > 2){
                    break;
                }
                System.out.println(i * j);
            }
            System.out.println(i);
        }
        // (b)
        for (int i = 1; i < 4; i++){
            for (int j = 1; j < 4; j++){
                if (i * j > 2){
                    continue;
                }
                System.out.println(i * j);
            }
            System.out.println(i);
        }
    }
}
