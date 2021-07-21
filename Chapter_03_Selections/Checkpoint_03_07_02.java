/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3.7 Generating Random Numbers, 110*/
import java.util.*;
public class Checkpoint_03_07_02 {
    public static void main(String[] args) {

        System.out.print("(a) A random integer between 0 and 20: ");
        int i = (int) (Math.random() * 20);
        System.out.println(i);

        System.out.print("(b) A random integer between 10 and 20: ");
        i = 10 + (int) (Math.random() * 10);
        System.out.println(i);

        System.out.print("(c) A random integer between 10 and 50: ");
        //Create a random integer between 0 and 50
        i = (int) (Math.random() * 50.00005);

        // If it is 0, create another one. It is very unlikely to produce two zeros in a row.
        if (i==0){
            i = (int) (Math.random() * 50.00005);
        }

        //Check which multiple of the randomly produced number is bigger than 10 and use that one as output.
        if(i<10){
                System.out.println(i*2);
        }
        else {
            System.out.println(i);
        }

        // (d) Return 1 or 0 randomly
        i = (int) (Math.random()*10);
        int j;
        boolean boole = i>=5;

        if (boole){
            j = 1;
        }
        else{
            j = 0;
        }
        System.out.println("(d) Random 1 and 0: "+ j);

    }
    /* This is not the best solution for this problem, but in order to stick to the teaching plan in the book,
    I tried to solve it with the techniques learned so far. */
}
