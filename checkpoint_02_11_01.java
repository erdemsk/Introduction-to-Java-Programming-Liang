/*Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 2.11.1.a Exponent Operations, 73*/
import java.util.*;

public class checkpoint_02_11_01 {
    public static void main(String[] args) {
        int a,b,c,d,r;

        //Asking inputs for every variable from the user:
        Scanner inputA= new Scanner (System.in);
        System.out.print("Enter a number for a: ");
        a= inputA.nextInt();

        Scanner inputB= new Scanner (System.in);
        System.out.print("Enter a number for b: ");
        b= inputB.nextInt();

        Scanner inputC= new Scanner (System.in);
        System.out.print("Enter a number for c: ");
        c= inputA.nextInt();

        Scanner inputD= new Scanner (System.in);
        System.out.print("Enter a number for d: ");
        d= inputA.nextInt();

        Scanner inputR= new Scanner (System.in);
        System.out.print("Enter a number for r: ");
        r= inputA.nextInt();

        System.out.println(4.0/(3*(r+34))-9*(a+b*c)+(3+d*(2+a))/(a+b*d));
    }
}
