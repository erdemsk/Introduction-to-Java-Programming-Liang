/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6.5 Passing Parameters by Values, 236*/
public class Increment {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the call, x is " + x);
        increment (x);
        System.out.println("After the call, x is " + x);
    }
    //define the increment() method
    public static void increment (int number){
        number++;
        System.out.println("number inside the method is " + number);
    }
}
