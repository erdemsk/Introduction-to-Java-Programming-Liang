/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.13, 218*/
public class FindTheLargestN {
    public static void main(String[] args) {
        int n = 1;
        int largestN = 1;

        //keep increasing the n value until it exceeds 12.000
        while (Math.pow(n, 2) < 12000){
            largestN = n;
            n++;
        }
        //display the result
        System.out.printf("%d is the largest number that it's square (%d) is less than 12.000", largestN, (int) Math.pow(largestN, 2));
    }
}
