/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
3. Programming Exercises 3.20, 133*/
import java.util.Scanner;

public class WindChillTemperature {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user enter a temperature and wind speed value
        System.out.print("Enter a temperature between -58°F and 41°F: ");
        double outsideTemperature = input.nextDouble();

        if (outsideTemperature < -58 || outsideTemperature > 41){
            System.out.println("Please enter a temperature between -58°F and 41°F");
            System.exit(1);
        }

        System.out.print("Enter the wind speed (equal or greater than 2) in miles per hour: ");
        double windSpeed = input.nextDouble();

        //calculate the wind-chill temperature
        double windChillIndex = (int) ((35.74 + 0.6215 * outsideTemperature - 35.75 * Math.pow(windSpeed,0.16) + 0.4275 * outsideTemperature * Math.pow(windSpeed, 0.16))*100000)/100000.0;

        //display the result
        System.out.print("The wind chill index is "+windChillIndex);
    }
}
