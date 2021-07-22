/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4.4 The String Type, 160-161*/
public class Checkpoint_04_04_05 {
    public static void main(String[] args) {
        String s1 = " Welcome ";
        String s2 = " welcome ";

        boolean isEqual = s1.equals(s2);
        System.out.println("(a) " + isEqual);

        boolean isEqual2 = s1.equalsIgnoreCase(s2);
        System.out.println("(b) " + isEqual2);

        int x = s1.compareTo(s2);
        System.out.println("(c) " + x);

        int x2 = s1.compareToIgnoreCase(s2);
        System.out.println("(d) " + x2);

        boolean b = s1.startsWith("AAA");
        System.out.println("(e) " + b);

        boolean b2 = s1.endsWith("AAA");
        System.out.println("(f) " + b2);

        int x3 = s1.length();
        System.out.println("(g) " + x3);

        char x4 = s1.charAt(0);
        System.out.println("(h) "+ x4);

        String s3 = s1 + s2;
        System.out.println("(i) " + s3);

        System.out.println("(j) " + s1.substring(1));

        System.out.println("(k) " + s1.substring(1,4));

        String s3_02 = s1.toLowerCase();
        System.out.println("(l) " + s3_02);

        String s3_03 = s1.toUpperCase();
        System.out.println("(m) " + s3_03);

        String s3_04 = s1.trim();
        System.out.println("(n) " + s3_04);

        int x5 = s1.indexOf('e');
        System.out.println("(o) " + x5);

        int x6 = s1.lastIndexOf("abc");
        System.out.println("(p) " + x6);
    }
}
