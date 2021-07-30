/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6.3 Calling a Method, 230*/
public class TestMax {
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int k = max (i, j);

        //display the larger value
        System.out.println("The maximum of " + i + " and " + j + " is " + k);
    }
    //declare the max() method
    public static int max (int number1, int number2){
        if (number1 > number2){
            return number1;
        }
        else {
            return number2;
        }
    }
}
