/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 5.14 Case Study: Displaying Prime Numbers, 215*/
public class Checkpoint_05_14_01 {
    public static void main(String[] args) {
        //define constants for number of primes and number of primes per line
        final int NUMBER_OF_PRIMES = 50;
        final int NUMBER_OF_PRIMES_PER_LINE = 10;

        int count = 0;
        int number = 2;

        System.out.println("The first 50 prime numbers are");
        //repeatedly find prime numbers
        while (count < NUMBER_OF_PRIMES){
            //assume the number is prime
            boolean isPrime = true;

            //test whether the number is prime or not
            for (int divisor = 2; divisor <= number / 2; divisor++){
                if (number % divisor == 0) { //if true, the number is not prime.
                    isPrime = false; //set isPrime to false
                    break;
                }
            }
            //display the prime number and increase the 'count'
            if (isPrime){
                count++;
                /*if the number of primes reaches 10, display the number in a new line
                if the number of primes in a line is not 10, prompt the 'number' and a space*/
                System.out.print(count % NUMBER_OF_PRIMES_PER_LINE == 0 ? number + "\n" : number + " ");
            }
            //check if the next number is prime or not
            number++;
        }
    }
}
