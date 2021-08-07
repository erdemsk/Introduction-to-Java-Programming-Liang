/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.18, 218*/
public class DisplayPatternBUsingForLoop {
    public static void main(String[] args) {
        final int NUMBER_OF_LINES = 6;

        System.out.print("Pattern B\n");
        //to apply numberOfLines
        for (int i = 0; i < NUMBER_OF_LINES; i++){
            //to display asterisks, the number of asterisks will decrease by 1 in each line
            for (int j = NUMBER_OF_LINES; j > i; j--){
                System.out.print("* ");
            }
            //move to the next line
            System.out.println();
        }
    }
}
