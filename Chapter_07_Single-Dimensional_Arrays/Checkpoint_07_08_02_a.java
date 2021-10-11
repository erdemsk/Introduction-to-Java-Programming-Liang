/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
7.8 Case Study: Counting the Occurrences of Each Letter, 279*/
public class Checkpoint_07_08_02_a {
    public static void main(String[] args) {
        int number = 0;
        int[] numbers = new int[1];

        m(number, numbers);

        System.out.println("number is " + number + " and numbers[0] is " + numbers[0]);
    }

    public static void m(int x, int[] y){
        x = 3;
        y[0] = 3;
    }
}
