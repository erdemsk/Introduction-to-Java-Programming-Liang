/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
7.10 Searching Arrays, 292*/
public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int i = BinarySearch.binarySearch(list, 2); //returns 0
        int j = BinarySearch.binarySearch(list, 11); //returns 4
        int k = BinarySearch.binarySearch(list, 12); //returns -6
        int l = BinarySearch.binarySearch(list, 1); //returns -1
        int m = BinarySearch.binarySearch(list, 3); //returns -2

        //display the results
        System.out.println("Binary search results are:\ni: " + i + "\nj: " + j + "\nk: " + k +
                "\nl: " + l + "\nm: " + m);
    }

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;

            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -low - 1;
    }
}
