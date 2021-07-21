/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 2. Programming Exercises 2.17, 95*/
import java.util.*;
public class WindChillTemperature {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user enter a temperature and wind speed value
        System.out.print("Enter a temperature between -58°F and 41°F: ");
        double outsideTemperature = input.nextDouble();

        System.out.print("Enter the wind speed (equal or greater than 2) in miles per hour: ");
        double windSpeed = input.nextDouble();

        //calculate the wind-chill temperature
        double windChillIndex = (int) ((35.74 + 0.6215 * outsideTemperature - 35.75 * Math.pow(windSpeed,0.16) + 0.4275 * outsideTemperature * Math.pow(windSpeed, 0.16))*100000)/100000.0;

        //display the result
        System.out.print("The wind chill index is "+windChillIndex);
    }
}
