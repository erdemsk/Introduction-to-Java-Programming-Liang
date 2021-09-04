/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.27, 264*/
public class Emirp {
    public static void main(String[] args) {
        final int NUMBER_OF_NONPALINDROMIC_PRIMES = 120;
        int nonpalindromicPrimeNumbers = 0;
        int number = 2;

        while (nonpalindromicPrimeNumbers < NUMBER_OF_NONPALINDROMIC_PRIMES){
            //if a number is prime, its' reversal is prime and nonpalindrome
            if (isPrime(number) && isPrime(reverse(number)) && !isPalindrome(number)){
                //move to the next line if there are already 10 emirps in a line
                if (nonpalindromicPrimeNumbers % 10 == 0){
                    System.out.println();
                }
                //display the number and increase the nonpalindromicPrimeNumbers
                System.out.printf("%d ", number);
                nonpalindromicPrimeNumbers++;
            }
            //check if the next number is a nonpalindromic prime, whose reversal is also a prime
            number++;
        }
    }

    //check if the number is prime
    public static boolean isPrime(int number){
        for (int divisor = 2; divisor <= number / 2; divisor++){
            if (number % divisor == 0){
                return false;
            }
        }
        return true;
    }

    //return true if the number is a palindrome
    public static boolean isPalindrome(int number){
        return number == reverse(number);
    }

    //return the reversal of an integer
    public static int reverse(int number){
        String numberString = "" + number;
        int reversalNumber = 0;

        for (int i = 1; i <= numberString.length(); i++){
            //swap the last digit with the first digit and remove it from the number, then continue to swapping numbers between
            reversalNumber += (number % 10) * Math.pow(10, numberString.length() - i);
            number /= 10;
        }
        return reversalNumber;
    }
}
