/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.3, 217*/
public class ConversionFromCelsiusToFahrenheit {
    public static void main(String[] args) {
        System.out.println("Celsius         Fahrenheit");

        for(double i = 0; i <= 100; i = i + 2){
            System.out.print((int) i + "                   " + (i * 9 / 5 + 32) + "\n");
        }
    }
}
