/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.5, 217*/
public class ConversionFromFahrenheitToCelsiusAndViceVersa {
        public static void main(String[] args) {
            final int LAST_CELSIUS = 100;
            final int LAST_FAHRENHEIT = 270;

            System.out.println("Celsius \t Fahrenheit \t | \t\t Fahrenheit \t Celsius");
            for (int celsius = 0, fahrenheit = 20; celsius <= LAST_CELSIUS && fahrenheit <= LAST_FAHRENHEIT;
            celsius = celsius + 2, fahrenheit = fahrenheit + 5){
                System.out.printf("%d \t\t\t\t%7.3f \t | \t\t %d \t\t\t %7.3f\n",celsius, celsius * 9 / 5.0 + 32, fahrenheit, (fahrenheit - 32) * 5 / 9.0 );
            }
    }
}

