/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 5.12 Keywords break and continue, 208*/
public class TestBreak {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        while (number < 20){
            number++;
            sum += number;
            //the loop will be terminated when the sum becomes equal or greater than 100 without waiting for the 'number' to be 20
            if (sum >= 100){
                break;
            }
        }
        System.out.println("The number is " + number);
        System.out.println("The sum is " + sum);
    }
}
