/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
7.11 Sorting Arrays, 294*/
public class Checkpoint_07_11_02 {
    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        selectionSort(list);

        //display the sorted list
        for (int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
    }

    public static void selectionSort(double[] list){
        for (int i = 0; i < list.length - 1; i++){
            //find the maximum in the list[i..list.length-1}
            double currentMax = list[i];
            int currentMaxIndex = i;

            for (int j = i + 1; j < list.length; j++){
                if (currentMax < list[j]){
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }

            //swap list[i] with list[currentMaxIndex] if necessary
            if (currentMaxIndex != i){
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }
}
