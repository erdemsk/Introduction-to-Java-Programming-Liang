/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.28, 264*/
public class MersennePrime {
    public static void main(String[] args) {
        final int MERSENNE_PRIME_SUPERIOR_LIMIT = 31;

        //display the heading
        System.out.print("i \t\t 2^i - 1\n----------------\n");

        //loop through the numbers from 2 to 31, to find the mersenne primes
        for (int i = 2; i <= MERSENNE_PRIME_SUPERIOR_LIMIT; i++){
            if (mersennePrime(i) != 0){
                System.out.printf("%-4d %11d\n", i, mersennePrime(i));
            }
        }
    }

    //check if the number is a prime
    public static boolean isPrime(int number){
        for (int divisor = 2; divisor <= number / 2; divisor++){
            if (number % divisor == 0){
                return false;
            }
        }
        return true;
    }

    //check if the number is a mersenne prime
    public static int mersennePrime(int number){
        int mersenne = (int) Math.pow(2, number) - 1;

        if (isPrime(mersenne)){
            return mersenne;
        }
        return 0;
    }
}
