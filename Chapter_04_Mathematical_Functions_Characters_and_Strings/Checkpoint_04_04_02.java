/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4.4 The String Type, 160*/
public class Checkpoint_04_04_02 {
    public static void main(String[] args) {
        String s1 = "lorem ipsum dolor sit amet";
        String s2 = "consectetur adipisicing elit";

        String s = "Welcome to Java";
        System.out.println(s);

        String s3 = s1 + s2;
        System.out.println(s3);

        /* following line is going to produce java: bad operand types for binary operator '-' error
        String s3Update = s1 - s2;
        System.out.println(s3Update);*/

        //following line is not going to produce a compile error but is not reliable when comparing two strings.
        System.out.println(s1 == s2);
        /* following line is going to produce java: bad operand types for binary operator '>=' error
        System.out.println(s1 >= s2);*/

        System.out.println(s1.compareTo(s2));

        int i = s1.length();
        System.out.println(i);

        /* following line is going to produce java: cannot find symbol error
        char c1 = s1(0);
        System.out.println(c1);*/

        /* following line is going to produce Exception in thread "main" java.lang.StringIndexOutOfBoundsException error
        char c2 = s1.charAt(s1.length());
        System.out.println(c2);*/

    }
}
