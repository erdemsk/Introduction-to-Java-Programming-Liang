/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 2. Programming Exercises 2.11, 93*/
import java.util.*;
public class PopulationProjection {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask user the number of years:
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        //convert years to seconds
        long seconds = years*365*24*60*60; // years*days*hours*minutes*seconds

        //calculate the population projection with respect to: one birth in every 7 seconds, one death in every 13 seconds, one new immigrant in every 45 seconds
        int currentPopulation = 312032486;
        long populationProjection = (long) (currentPopulation + (seconds/7.0) - (seconds/13.0) + (seconds/45.0)); //wouldn't produce the same output with integer divisors

        System.out.println("The population in "+years+" years is "+populationProjection);
    }
}
