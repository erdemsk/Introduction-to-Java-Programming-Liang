/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.19, 219*/
public class DisplayNumbersInAPyramidPattern {
    public static void main(String[] args) {
        final int NUMBER_OF_ROWS = 8;

        int numberOfEmptyItems = 7;
        int spacesInARow = numberOfEmptyItems;

        for (int i = 0; i < NUMBER_OF_ROWS; i++) {
            //printing spaces (6 at a time)
            while (spacesInARow > 0){
                System.out.print("      ");
                spacesInARow--;
            }
            //decrease the number of spaces that will show up in the next line
            numberOfEmptyItems--;
            spacesInARow = numberOfEmptyItems;

            //print the numbers in ascending order
            for (int j = 0; j < i; j++){
                System.out.printf("%6d", (int) Math.pow(3, j));
            }

            //print the numbers in descending order
            for (int k = i; k >= 0; k--){
                System.out.printf("%6d", (int) Math.pow(3, k));
            }

            //move to the next row
            System.out.println();
        }
    }
}
