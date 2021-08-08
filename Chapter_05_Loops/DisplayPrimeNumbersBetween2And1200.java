/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.20, 219*/
public class DisplayPrimeNumbersBetween2And1200 {
    public static void main(String[] args) {
        final int NUMBERS_PER_LINE = 8;
        final int SUPERIOR_LIMIT = 1200;
        int number = 2;
        int count = 0;

        System.out.print("The prime numbers between 2 and 1200 are: \n");
        while (number <= SUPERIOR_LIMIT){
            //Let's assume the number is prime
            boolean isPrime = true;

            //check if the number is prime, if not set isPrime to false
            for (int divisor = 2; divisor <= number / 2; divisor++){
                if (number % divisor == 0){
                    isPrime = false;
                    break; //exit the for loop
                }
            }

            //if the number is prime, increase the count variable and display the number
            if (isPrime){
                //check if there are 8 numbers in the line, if so move to the next line
                if (count % NUMBERS_PER_LINE == 0){
                    System.out.println();
                }

                //display the prime numbers as separated exactly by one space
                System.out.printf("%d ", number);

                //increase the count of prime numbers
                count++;
            }
            //check if the next number is prime or not
            number++;
        }
    }
}
