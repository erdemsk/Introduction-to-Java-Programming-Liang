/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.18, 218*/
public class DisplayPatternCUsingForLoop {
    public static void main(String[] args) {
        final int NUMBER_OF_LINES = 6;

        System.out.print("\tPattern C\n");
        //to apply numberOfLines
        for (int i = 0; i < NUMBER_OF_LINES; i++){
            //to display spaces, the number of spaces will decrease by 1 in each line
            for (int j = NUMBER_OF_LINES; j > i; j--){
                System.out.print("  ");
            }

            //to display asterisks, the number of asterisks will increase by 1 in each line
            for (int j = 0; j <= i; j++){
                System.out.print(" *");
            }

            //move to the next line
            System.out.println();
        }
    }
}
