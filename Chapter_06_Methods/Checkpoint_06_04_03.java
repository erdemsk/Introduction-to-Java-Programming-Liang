/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6.4 void vs. Value-Returning Methods, 235*/
public class Checkpoint_06_04_03 {
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int k = max (i, j);
        System.out.println("The maximum of " + i + " and " + j + " is " + k);
    }
    //define the max() method via conditional operator
    public static int max (int number1, int number2){
        return (number1 > number2) ? number1 : number2;
    }
}
