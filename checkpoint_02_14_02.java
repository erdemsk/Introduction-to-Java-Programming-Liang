/*Introduction to Java Programming and Data Structures, Liang, 11th Edition,
2.14 Increment and Decrement Operators, 78*/
public class checkpoint_02_14_02 {
    public static void main(String[] args) {
        int a = 6;
        int b = a++;
        System.out.println("a: "+a);
        System.out.println("b: "+b);

        a = 6;
        b = ++a;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
