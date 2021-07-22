/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4.3 Character Data Type and Operations, 151*/
public class Checkpoint_04_03_05 {
    public static void main(String[] args) {
        char cOne = 'A';
        int iOne = (int) cOne;

        float f = 1000.34f;
        int iTwo = (int) f;

        double d = 1000.34;
        int iThree = (int) d;

        int iFour = 97;
        char cTwo = (char) iFour;

        System.out.println(iOne);
        System.out.println(iTwo);
        System.out.println(iThree);
        System.out.println(cTwo);
    }
}
