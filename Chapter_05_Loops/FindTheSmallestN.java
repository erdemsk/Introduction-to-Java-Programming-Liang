/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.12, 218*/
public class FindTheSmallestN {
    public static void main(String[] args) {
        int n = 30;
        int smallestN = 30;

        //keep decreasing the n value until it becomes less than 12.000
        while (Math.pow(n, 3) > 12000){
            smallestN = n;
            n--;
        }
        //display the result
        System.out.printf("%d is the smallest number that it's cube (%,d) is greater than 12.000", smallestN, (int) Math.pow(smallestN, 3));
    }
}
