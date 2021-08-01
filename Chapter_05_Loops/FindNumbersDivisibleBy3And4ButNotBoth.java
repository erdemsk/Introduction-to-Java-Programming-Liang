/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.11, 218*/
public class FindNumbersDivisibleBy3And4ButNotBoth {
    public static void main(String[] args) {
        int numbersPerLine = 0;
        System.out.println("Numbers that are divisible by 3 or 4, but not both from 100 to 1000:");

        //Print the numbers that are divisible by 3 and 4, if the numbers per line reaches to 10, switch to the new line
        for (int i = 100; i < 1000; i++){
            if (i % 3 == 0 ^ i % 4 == 0){
                if (numbersPerLine % 10 == 0){
                    System.out.printf("\n%d ", i);
                }
                else {
                    System.out.printf("%d ", i);
                }
                numbersPerLine++;
            }
        }
    }
}
