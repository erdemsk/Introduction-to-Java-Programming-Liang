/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6.6 Modularizing Code, 240*/
public class PrimeNumberMethod {
    public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are \n");
        printPrimeNumbers(50);
    }
    //define the printPrimeNumbers() method
    public static void printPrimeNumbers(int numberOfPrimes) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int number = 2;

        //repeatedly find prime numbers
        while (count < numberOfPrimes) {
            //print the prime number and increase the count
            if (isPrime(number)) {
                count++; //Increase the count
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    //print the number and advance to the new line
                    System.out.printf("%-5d\n", number);
                } else {
                    System.out.printf("%-5d", number);
                }
            }
            //Check whether the next number is prime
            number++;
        }
    }
    //define the isPrime() method
    public static boolean isPrime (int number){
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { //if true, number is not prime
                return false;
            }
        }
        return true;
    }
}