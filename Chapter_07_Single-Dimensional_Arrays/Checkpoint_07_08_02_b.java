/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
7.8 Case Study: Counting the Occurrences of Each Letter, 279*/
public class Checkpoint_07_08_02_b {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        reverse(list);
        for (int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
    }

    public static void reverse(int[] list){
        int[] newList = new int[list.length];

        for(int i = 0; i < list.length; i++){
            newList[i] = list[list.length - 1 - i];
        }

        list = newList;
    }
}
