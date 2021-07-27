/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4. Programming Exercises 4.24, 179*/
import java.util.*;
public class EnterThreeCountries {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter three countries
        System.out.print("Enter the first country: ");
        String firstCountry = input.next();
        System.out.print("Enter the second country: ");
        String secondCountry = input.next();
        System.out.print("Enter the third country: ");
        String thirdCountry = input.next();

        //when second or third country is greatest
        if (firstCountry.compareTo(secondCountry) < 0 && firstCountry.compareTo(thirdCountry) < 0){
            if (secondCountry.compareTo(thirdCountry) < 0){
                String temp = firstCountry;
                firstCountry = thirdCountry;
                thirdCountry = temp;
            }
            else {
                String temp = firstCountry;
                firstCountry = secondCountry;
                secondCountry = thirdCountry;
                thirdCountry = temp;
            }
        }
        //when first or third country is greatest
        else if (secondCountry.compareTo(firstCountry) < 0 && secondCountry.compareTo(thirdCountry) < 0){
            if (firstCountry.compareTo(thirdCountry) < 0){
                String temp = firstCountry;
                firstCountry = thirdCountry;
                thirdCountry = secondCountry;
                secondCountry = temp;
            }
            else {
                String temp = secondCountry;
                secondCountry = thirdCountry;
                thirdCountry = temp;
            }
        }
        //when first or second country is greatest
        else{
            if (firstCountry.compareTo(secondCountry) < 0){
                String temp = firstCountry;
                firstCountry = secondCountry;
                secondCountry = temp;
            }
            //else first > second > third, so there will be no action
        }

        //display the result
        System.out.printf("The three countries in descending order are: %s %s %s ", firstCountry, secondCountry, thirdCountry);
    }
}
