/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4.4 The String Type, 161*/
public class Checkpoint_04_04_07 {
    public static void main(String[] args) {

        //initialize a double variable
        double d = 1234567.123;
        System.out.println("d is " + d);

        //convert double variable to a String
        String stringOfD = d + "";

        //display the number of all digits
        System.out.println("All digits in d is " + (stringOfD.length()-1));

        //remove the digits after the decimal point and display the number of digits before the decimal point
        String digitsBeforeDecimalPoint = stringOfD.substring(0,stringOfD.indexOf('.'));
        System.out.println("Number of digits before the decimal point is " + digitsBeforeDecimalPoint.length());

        //remove the digits before the decimal point and display the number of the digits after the decimal point
        String digitsAfterDecimalPoint = stringOfD.substring((stringOfD.indexOf('.')));
        System.out.println("Number of digits after the decimal point is " + (digitsAfterDecimalPoint.length() - 1));
    }
}
