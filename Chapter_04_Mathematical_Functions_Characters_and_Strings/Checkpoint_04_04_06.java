/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4.4 The String Type, 161*/
public class Checkpoint_04_04_06 {
    public static void main(String[] args) {
        int i = 123456789;
        String stringOfI = i + "";
        //display the number of digits in i variable
        System.out.println("Number of digits in i is "+ stringOfI.length());
    }
}
