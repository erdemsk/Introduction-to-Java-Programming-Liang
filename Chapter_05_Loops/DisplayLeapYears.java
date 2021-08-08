/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.27, 220*/
public class DisplayLeapYears {
    public static void main(String[] args) {
        final int BEGINNING_YEAR = 2014;
        final int END_YEAR = 2114;

        int numberOfLeapYears = 0;

        System.out.print("The leap years from 2014 to 2114 are: ");
        for (int year = BEGINNING_YEAR; year <= END_YEAR; year++){
            //set the boolean variable to determine leap years
            boolean isLeap = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);

            //check if the year is a leap year
            if (isLeap){
                //move to the next line if you already displayed 10 leap years in a line
                if (numberOfLeapYears % 10 == 0){
                    System.out.println();
                }

                //display the leap year and increase the number of leap years
                System.out.printf("%d ", year);
                numberOfLeapYears++;
            }
        }
        //display how many leap years are there between 2014 and 2114
        System.out.println("\nThere are " + numberOfLeapYears + " leap years between 2014 and 2114");
    }
}
