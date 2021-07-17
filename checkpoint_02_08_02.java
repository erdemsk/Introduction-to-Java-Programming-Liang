//Introduction to Java Programming and Data Structures, Liang, 11th Edition, 2.8 Naming Conventions, 66-67
public class checkpoint_02_08_02 {
    public static void main(String[] args) {
        //Step 1: Declare a double variable named miles with an initial value 100.
        //Step 2: Declare a double constant named KILOMETERS_PER_MILE with value 1.609
        //Step 3: Declare a double variable named kilometers, multiply miles and KILOMETERS_PER_MILE, and assign the result to kilometers.
        //Step 4: Display kilometers to the console.
        double miles = 100;
        final double KILOMETERS_PER_MILE=1.609;
        double kilometers=miles*KILOMETERS_PER_MILE;

        System.out.println("Kilometers: "+kilometers);

    }
}
