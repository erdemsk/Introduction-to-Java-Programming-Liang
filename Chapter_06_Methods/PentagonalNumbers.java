/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.1, 258*/
public class PentagonalNumbers {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            System.out.printf("%7d", getPentagonalNumber(i + 1));
            if ((i + 1) % 10 == 0){
                System.out.println();
            }
        }
    }

    //define the getPentagonalNumber() method
    public static int getPentagonalNumber(int number){
        return number * (3 * number - 1) / 2;
    }
}
