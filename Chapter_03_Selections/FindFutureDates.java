/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3. Programming Exercises 3.5, 131*/
import java.util.*;
public class FindFutureDates {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Ask the user to enter today's day, and future day
        System.out.print("Enter today's day: ");
        int numberOfToday = input.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int numberOfFutureDay = input.nextInt();

        /* display the result
        be careful about nested switch operations.
        For example, in Line 27: if you pass the break, all options for "today is..." with same "future day is..." will be executed.*/
        switch (numberOfToday % 7){
            case 0: switch (numberOfFutureDay % 7){
                case 0: System.out.println("Today is Sunday and the future day is Sunday"); break;
                case 1: System.out.println("Today is Sunday and the future day is Monday"); break;
                case 2: System.out.println("Today is Sunday and the future day is Tuesday"); break;
                case 3: System.out.println("Today is Sunday and the future day is Wednesday"); break;
                case 4: System.out.println("Today is Sunday and the future day is Thursday"); break;
                case 5: System.out.println("Today is Sunday and the future day is Friday"); break;
                case 6: System.out.println("Today is Sunday and the future day is Saturday"); break;
            }
            case 1: switch (numberOfFutureDay % 7){
                case 0: System.out.println("Today is Monday and the future day is Monday"); break;
                case 1: System.out.println("Today is Monday and the future day is Tuesday"); break;
                case 2: System.out.println("Today is Monday and the future day is Wednesday"); break;
                case 3: System.out.println("Today is Monday and the future day is Thursday"); break;
                case 4: System.out.println("Today is Monday and the future day is Friday"); break;
                case 5: System.out.println("Today is Monday and the future day is Saturday"); break;
                case 6: System.out.println("Today is Monday and the future day is Sunday"); break;
            } break;
            case 2: switch (numberOfFutureDay % 7){
                case 0: System.out.println("Today is Tuesday and the future day is Tuesday"); break;
                case 1: System.out.println("Today is Tuesday and the future day is Wednesday"); break;
                case 2: System.out.println("Today is Tuesday and the future day is Thursday"); break;
                case 3: System.out.println("Today is Tuesday and the future day is Friday"); break;
                case 4: System.out.println("Today is Tuesday and the future day is Saturday"); break;
                case 5: System.out.println("Today is Tuesday and the future day is Sunday"); break;
                case 6: System.out.println("Today is Tuesday and the future day is Monday"); break;
            } break;
            case 3: switch (numberOfFutureDay % 7){
                case 0: System.out.println("Today is Wednesday and the future day is Wednesday"); break;
                case 1: System.out.println("Today is Wednesday and the future day is Thursday"); break;
                case 2: System.out.println("Today is Wednesday and the future day is Friday"); break;
                case 3: System.out.println("Today is Wednesday and the future day is Saturday"); break;
                case 4: System.out.println("Today is Wednesday and the future day is Sunday"); break;
                case 5: System.out.println("Today is Wednesday and the future day is Monday"); break;
                case 6: System.out.println("Today is Wednesday and the future day is Tuesday"); break;

            } break;
            case 4: switch (numberOfFutureDay % 7){
                case 0: System.out.println("Today is Thursday and the future day is Thursday"); break;
                case 1: System.out.println("Today is Thursday and the future day is Friday"); break;
                case 2: System.out.println("Today is Thursday and the future day is Saturday"); break;
                case 3: System.out.println("Today is Thursday and the future day is Sunday"); break;
                case 4: System.out.println("Today is Thursday and the future day is Monday"); break;
                case 5: System.out.println("Today is Thursday and the future day is Tuesday"); break;
                case 6: System.out.println("Today is Thursday and the future day is Wednesday"); break;
            } break;
            case 5: switch (numberOfFutureDay % 7){
                case 0: System.out.println("Today is Friday and the future day is Friday"); break;
                case 1: System.out.println("Today is Friday and the future day is Saturday"); break;
                case 2: System.out.println("Today is Friday and the future day is Sunday"); break;
                case 3: System.out.println("Today is Friday and the future day is Monday"); break;
                case 4: System.out.println("Today is Friday and the future day is Tuesday"); break;
                case 5: System.out.println("Today is Friday and the future day is Wednesday"); break;
                case 6: System.out.println("Today is Friday and the future day is Thursday"); break;
            } break;
            case 6: switch (numberOfFutureDay % 7){
                case 0: System.out.println("Today is Saturday and the future day is Saturday"); break;
                case 1: System.out.println("Today is Saturday and the future day is Sunday"); break;
                case 2: System.out.println("Today is Saturday and the future day is Monday"); break;
                case 3: System.out.println("Today is Saturday and the future day is Tuesday"); break;
                case 4: System.out.println("Today is Saturday and the future day is Wednesday"); break;
                case 5: System.out.println("Today is Saturday and the future day is Thursday"); break;
                case 6: System.out.println("Today is Saturday and the future day is Friday"); break;
            } break;
        }
    }
}
