/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.3, 217*/
public class ConversionFromCelsiusToFahrenheit {
    public static void main(String[] args) {
        final int LAST_CELSIUS = 100;

        System.out.println("Celsius\t\t\tFahrenheit");
        for(double i = 0; i <= LAST_CELSIUS; i = i + 2){
            System.out.printf("%d \t\t\t\t\t %5.1f\n", (int) i, (i * 9 / 5 + 32));
        }
    }
}
