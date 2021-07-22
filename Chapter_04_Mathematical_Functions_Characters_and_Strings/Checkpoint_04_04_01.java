/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4.4 The String Type, 159*/
public class Checkpoint_04_04_01 {
    public static void main(String[] args) {
        String s1 = "Welcome to Java";
        String s2 = "Programming is fun";
        String s3 = "Welcome to Java";

        System.out.println("(a) " + (s1 == s2));
        System.out.println("(b) " + (s2 == s3));
        System.out.println("(c) " + s1.equals(s2));
        System.out.println("(d) " + s2.equals(s3));
        System.out.println("(e) " + s1.compareTo(s2));
        System.out.println("(f) " + s2.compareTo(s3));
        System.out.println("(g) " + s2.compareTo(s2));
        System.out.println("(h) " + s1.charAt(0));
        System.out.println("(i) " + s1.indexOf('j'));
        System.out.println("(j) " + s1.indexOf("to"));
        System.out.println("(k) " + s1.lastIndexOf('a'));
        System.out.println("(l) " + s1.lastIndexOf("o",15));
        System.out.println("(m) " + s1.length());
        System.out.println("(n) " + s1.substring(5));
        System.out.println("(o) " + s1.substring(5,11));
        System.out.println("(p) " + s1.startsWith("Wel"));
        System.out.println("(q) " + s1.endsWith("Java"));
        System.out.println("(r) " + s1.toLowerCase());
        System.out.println("(s) " + s1.toUpperCase());
        System.out.println("(t) " + s1.concat(s2));
        System.out.println("(u) " + s1.contains(s2));
        System.out.println("(v) " + "\t Wel \t".trim());
    }
}
