/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 5.12 Keywords break and continue, 211*/
public class Checkpoint_05_12_03 {
    public static void main(String[] args) {
        //(a) Rewrite of TestBreak.java
        int sum = 0;
        int number = 0;

        //the loop will be terminated when the sum becomes equal or greater than 100 without waiting for the 'number' to be 20
        while (number < 20 && sum < 100){
            number++;
            sum += number;
        }
        System.out.println("The number is " + number);
        System.out.println("The sum is " + sum);

        //(b) Rewrite of TestContinue.java
        sum = 0;
        number = 0;

        //add every number that is less than 20 except 10 and 11 to the 'sum'
        while (number < 20){
            number++;
            if (number != 10 && number != 11){
                sum += number;
            }
        }
        //display the result
        System.out.println("The sum is: " + sum);
    }
}
