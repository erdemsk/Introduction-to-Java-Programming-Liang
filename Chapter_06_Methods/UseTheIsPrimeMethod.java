/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.10, 260*/
import java.util.*;
public class UseTheIsPrimeMethod {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a number to display how many prime numbers are there that are less than the input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        //invoke the numberOfPrimeNumbersLessThanN() method
        System.out.println("Number of prime numbers that are less than " + number + " is "
                + numberOfPrimeNumbersLessThanN(number));
    }

    //find the number of prime numbers less than n
    public static int numberOfPrimeNumbersLessThanN(int n){
        int numberOfPrimeNumbers = 0;
        int i = 2;

        while (i < n){
            if (isPrime(i)){
                numberOfPrimeNumbers++;
            }
            i++;
        }
        return numberOfPrimeNumbers;
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
}
