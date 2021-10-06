/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
7.5 Copying Arrays, 281*/
public class Checkpoint_07_05_01 {
    public static void main(String[] args) {
        int [] source = {3, 4, 5};
        int [] t = new int [source.length];

        //use the arracopy() method to copy the elements of source into t
        System.arraycopy(source, 0, t, 0, source.length);
    }
}
