/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.33, 222*/
public class PerfectNumber {
    public static void main(String[] args) {
        final int INFERIOR_LIMIT = 6;
        final int SUPERIOR_LIMIT = 10000;

        int sumOfDivisors;

        System.out.print("Perfect numbers from 6 to 10000 are: \n");
        //check each number from 6 to 10000 if it is a perfect number
        for (int number = INFERIOR_LIMIT; number < SUPERIOR_LIMIT; number++){
            sumOfDivisors = 0;

            /*find all the divisors of a number -excluding the number itself- and check if
            the sum of them is equal to the number*/
            for (int divisor = 1; divisor <= number / 2; divisor++){
                if (number % divisor == 0){
                    sumOfDivisors += divisor;
                }
            }

            //if the sum of all divisors -excluding the number itself- is equal to the number, it is a perfect number
            if (number == sumOfDivisors){
                System.out.printf("%d, ", number);
            }
        }
    }
}
