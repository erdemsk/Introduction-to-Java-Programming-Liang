/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3.15 Operator Precedence and Associativity, 127*/
public class Checkpoint_03_14_04 {
    public static void main(String[] args) {
        int x = 15;
        int y = -5;
        System.out.println(x > 0 && x < 10);
        System.out.println((x > 0) && (x < 10));

        System.out.println(x > 0 || x < 10);
        System.out.println(x > 0 || x < 10);

        System.out.println(x > 0 || x < 10 && y <0);
        System.out.println(x > 0 ||
                x < 10 && y <0);
    }
}
