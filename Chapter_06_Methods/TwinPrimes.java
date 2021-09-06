/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.29, 264-265*/
public class TwinPrimes {
    public static void main(String[] args) {
        final int TWIN_PRIMES_SUPERIOR_LIMIT = 1198;

        //display the heading
        System.out.print("Twin primes less than 1200 are:\n");

        //search through the numbers from 2 to 1998 to find the twin primes
        for (int i = 2; i < TWIN_PRIMES_SUPERIOR_LIMIT; i++){
            if (twinPrime(i) != 0){
                System.out.printf("(%d,%d)\n", i, (i+2));
            }
        }
    }

    //check if a number is part of a twin prime pair
    public static int twinPrime(int number){
        if(isPrime(number) && isPrime(number + 2)){
            return number;
        }
        return 0;
    }

    //check if a number is prime
    public static boolean isPrime(int number){
        for (int divisor = 2; divisor <= number / 2; divisor++){
            if (number % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
