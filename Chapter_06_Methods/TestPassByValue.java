/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6.5 Passing Parameters by Values, 237*/
public class TestPassByValue {
    public static void main(String[] args) {
        //declare and initialize variables
        int num1 = 1;
        int num2 = 2;

        System.out.println("Before invoking the swap method, num1 is " + num1 + " and num2 is " + num2);

        //invoke the swap() method
        swap (num1, num2);

        System.out.println("After invoking the swap method, num1 is " + num1 + " and num2 is " + num2);
    }
    //define the swap() method
    public static void swap (int n1 ,int n2){
        System.out.println("\tInside the swap method");
        System.out.println("\t\tBefore swapping, n1 is " + n1 + " and n2 is " + n2);

        //swap n1 with n2
        int temp = n1;
        n1 = n2;
        n2 = temp;

        //display the n1 and n2 after swapping
        System.out.println("\t\tAfter swapping, n1 is " + n1 + " and n2 is " + n2);
        /*Before the swap method is invoked (line 12), num1 is 1 and num2 is 2. After the swap method
        is invoked, num1 is still 1 and num2 is still 2. Their values have not been swapped. The values of the
        arguments num1 and num2 are passed to n1 and n2, but n1 and n2 have their own memory locations
        independent of num1 and num2. Therefore, changes in n1 and n2 do not affect the contents of num1 and num2*/
    }
}
