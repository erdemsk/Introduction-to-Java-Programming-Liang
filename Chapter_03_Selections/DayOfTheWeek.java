/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
3. Programming Exercises 3.21, 134*/
import java.util.Scanner;
public class DayOfTheWeek {
    public static void main(String[] args) {
        //Finding the day of the week via Zeller's Congruence

        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter the year, month and day of the month
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a month: ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month: ");
        int dayOfTheMonth = input.nextInt();

        // January and February are counted as 13th and 14th months of the previous year
        if (month == 1 || month == 2){
            month += 12;
            year -= 1;
        }

        //following variables are required for applying Zeller's congruence
        int yearOfTheCentury = year % 100;
        int j = year / 100;

        //apply Zeller's congruence
        int dayOfTheWeek = (dayOfTheMonth + 13 * (month+1) / 5 + 5 * yearOfTheCentury / 4 + 21 * j / 4) % 7;

        //display the result
        switch (dayOfTheWeek){
            case 0: System.out.println("The day of the week is Saturday.");break;
            case 1: System.out.println("The day of the week is Sunday.");break;
            case 2: System.out.println("The day of the week is Monday.");break;
            case 3: System.out.println("The day of the week is Tuesday.");break;
            case 4: System.out.println("The day of the week is Wednesday.");break;
            case 5: System.out.println("The day of the week is Thursday.");break;
            case 6: System.out.println("The day of the week is Friday.");break;
        }
    }
}
