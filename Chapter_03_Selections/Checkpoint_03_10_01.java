/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3.10 Logical Operators, 118*/
public class Checkpoint_03_10_01 {
    public static void main(String[] args) {
        int x = 1;
        System.out.println((true) && (3>4));
        System.out.println(!(x>0) && (x>0));
        System.out.println((x>0) || (x<0));
        System.out.println((x!=0) || (x==0));
        System.out.println((x>=0) || (x<0));
        System.out.println((x!=1) || !(x==1));
    }
}
