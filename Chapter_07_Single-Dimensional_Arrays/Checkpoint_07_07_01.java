/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
7.7 Returning an Array from a Method, 285*/
public class Checkpoint_07_07_01 {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 5, 4};

        for (int i = 0, j = list.length - 1; i < list.length / 2; i++, j--){
            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }

        for (int i = 0; i < 5; i++){
            System.out.println(list[i]);
        }
    }
}
