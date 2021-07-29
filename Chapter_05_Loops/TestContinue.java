/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 5.12 Keywords break and continue, 208*/
public class TestContinue {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        while (number < 20){
            number++;
            if (number == 10 || number == 11){
                continue; //10 and 11 won't be added to the 'sum'
            }
            sum += number;
        }
        System.out.println("The sum is: " + sum);
    }
}
