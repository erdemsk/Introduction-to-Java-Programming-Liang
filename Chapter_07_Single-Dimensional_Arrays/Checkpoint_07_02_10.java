/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
7.2 Array Basics, 276*/
public class Checkpoint_07_02_10 {
    public static void main(String[] args) {
        double [] r = new double[100];

        for (int i = 0; i < r.length; i++){
            r[i] = Math.random() * 100;
        }
    }
}
