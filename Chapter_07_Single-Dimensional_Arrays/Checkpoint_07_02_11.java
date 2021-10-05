/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
7.2 Array Basics, 276*/
public class Checkpoint_07_02_11 {
    public static void main(String[] args) {
        int list[] = {1, 2, 3, 4, 5, 6};

        for (int i = 1; i < list.length; i++){
            list[i] = list[i - 1];
        }

        for (int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
    }
}
