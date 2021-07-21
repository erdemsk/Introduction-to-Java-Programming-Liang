/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 2.18 Common Errors and Pitfalls, 87-89*/
public class CommonErrors {
    public static void main(String[] args) {
        // Integer overflow error
        System.out.println("Common errors: Integer overflow");
        int value=2147483647;
        System.out.println("2147483647 is: "+value);
        value +=1;
        System.out.println("2147483647+1 is:"+value);
        System.out.println();

        System.out.println("Common errors: Round-off Errors");
        System.out.println("1.0-0.1-0.1-0.1 is not 7.0 but: "+(1.0-0.1-0.1-0.1));
        System.out.println("1.0-0.9 is also not 0.1 but: "+ (1.0-0.9));
        System.out.println();

        System.out.println("Common errors: Unintended Integer Division");
        int a = 2;
        int b = 1;
        double average = (a+b)/2;
        System.out.println("(2+1)/2 = "+average);

        average=(a+b)/2.0;
        System.out.println("(2+1)/2.0 ="+average);

    }
}
