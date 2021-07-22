/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4.3 Character Data Type and Operations, 151*/
public class Checkpoint_04_03_02 {
    public static void main(String[] args) {
        char first = (char) '1';
        //Following line is going to produce "unclosed character literal" error, after 'd'
        //char second = (char) '\u345dE';
        char third = (char) '\u3fFa';
        // The following two are escape sequences
        char fourth = (char) '\b';
        char fifth = (char) '\t';

        System.out.println(first);
        //System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        System.out.println(fifth);
    }
}
