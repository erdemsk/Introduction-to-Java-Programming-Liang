/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.15, 218*/
public class DisplayTheASCIICharacterTable {
    public static void main(String[] args) {
        //define the counter variable and constants for the inferior and superior limits of for loop
        final int ASCII_CODE_OF_EXCLAMATION_POINT = 33;
        final int ASCII_CODE_OF_TILDE = 126;
        int count = 0;

        System.out.print("The ASCII Table from '!' to '~'");
        //display characters 10 per line
        for (int i = ASCII_CODE_OF_EXCLAMATION_POINT; i <= ASCII_CODE_OF_TILDE; i++){
            //move to the next line after the 10th character in a line
            if (count % 10 == 0){
                System.out.println();
            }
            System.out.printf("%c ", i);
            count++;
        }
    }
}
