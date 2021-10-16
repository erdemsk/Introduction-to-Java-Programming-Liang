/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
7.12 The Arrays Class, 296*/
public class Checkpoint_07_12_03 {
    public static void main(String[] args) {
        int[] list1 = {2, 4, 7, 10};
        java.util.Arrays.fill(list1, 7);
        System.out.println(java.util.Arrays.toString(list1));

        int[] list2 = {2, 4, 7, 10};
        System.out.println(java.util.Arrays.toString(list2));
        System.out.print(java.util.Arrays.equals(list1, list2));
    }
}
