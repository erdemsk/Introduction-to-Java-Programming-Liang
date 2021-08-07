/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.12, 261*/
public class DisplayNumbers {
    public static void main(String[] args) {
        //print the numbers from 1 to 100, as 10 numbers per line
        printNumbers(1, 100, 10);
    }

    //print the numbers from num1 to num2, as numberPerLine numbers per line
    public static void printNumbers(int num1, int num2, int numberPerLine){
        int count = 0;
        while (num1 <= num2){
            if ((count) % numberPerLine == 0){
                System.out.println();
            }
            System.out.printf("%d ", num1);

            num1++;
            count++;
        }
    }
}
