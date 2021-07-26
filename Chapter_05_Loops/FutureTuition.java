/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 5.11 Case Studies, 206*/
public class FutureTuition {
    public static void main(String[] args) {
        //the tuition will be $10000 in the first year
        double tuition = 10000;
        int year = 0;

        //keep increasing the tuition amount by 7% until it is greater than or equal to $20000
        while (tuition < 20000){
            tuition *= 1.07;
            year++;
        }

        //display the result
        System.out.println("Tuition will be doubled in " + year + " years");
        System.out.printf("Tuition will be $%.2f in %1d years", tuition, year);
    }
}
