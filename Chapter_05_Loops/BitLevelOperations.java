/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.44, 224
Learned how to solve via:
http://soultionmanual.blogspot.com/2016/08/chapter-5-exercise-44-introduction-to.html
I did not just copy and paste but tried to improve the source code.
*/
import java.util.Scanner;
public class BitLevelOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a byte value
        System.out.print("Enter an integer: ");
        byte n = input.nextByte();
        String s = "";

        //initialize a mask variable to extract the last bit after shifting
        byte mask = 0b1;

        for (int i = 0; i < 8; i++) {
            byte bit = (byte) (n & mask); // extracting last bit i.e the remainder of division by 2
            s = bit + s;
            // Shifting right is dividing by 2. The last bit is the remainder of the next shift.
            n = (byte) (n >> 1);
        }

        //display the result
        System.out.println("The 8 bits are " + s);
    }
}
