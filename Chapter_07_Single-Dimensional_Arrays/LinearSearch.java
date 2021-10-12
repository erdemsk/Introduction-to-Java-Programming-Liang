/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
7.10 Searching Arrays, 289*/
public class LinearSearch {
    public static void main(String[] args) {
        int[] list = {1, 4, 4, 2, 5, -3, 6, 2};
        int i = linearSearch(list, 4);
        int j = linearSearch(list, -4);
        int k = linearSearch(list, -3);

        //display the result of linear search
        System.out.println("Linear search results are:\ni: " + i + "\nj: " + j + "\nk: " + k);
    }

    public static int linearSearch(int[] list, int key){
        for (int i = 0; i < list.length; i++){
            if (key == list[i]){
                return i;
            }
        }
        return -1;
    }
}
