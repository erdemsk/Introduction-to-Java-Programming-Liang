/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4.4 The String Type, 154*/
public class ConcatenatingStrings {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;

        //Following statement produce --> i + j is 12 <-- It is because i + j is concatenated with i and j after turning them into string objects.
        System.out.println("i + j is " + i + j);

        //put i + j into parentheses, to force to execute the addition first
        System.out.println("i + j is " + (i + j));

    }
}
