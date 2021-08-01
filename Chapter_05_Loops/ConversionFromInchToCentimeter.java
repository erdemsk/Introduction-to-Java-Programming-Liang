/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.4, 217*/
public class ConversionFromInchToCentimeter {
    public static void main(String[] args) {
        final int LAST_INCH = 10;

        System.out.println("Inches \t\t\t\t Centimeters");
        for (double i = 1; i <= LAST_INCH; i++){
            System.out.printf("%d\t\t\t\t\t %-4.2f\n", (int) i, i * 2.54);
        }
    }
}
