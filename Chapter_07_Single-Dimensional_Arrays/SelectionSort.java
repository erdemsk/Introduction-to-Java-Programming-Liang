/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
7.11 Sorting Arrays, 294*/
public class SelectionSort {
    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        SelectionSort.selectionSort(list);

        //display the sorted list
        for (int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
    }

    public static void selectionSort(double[] list){
        for (int i = 0; i < list.length - 1; i++){
            //find the minimum in the list[i..list.length-1}
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++){
                if (currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            //swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
