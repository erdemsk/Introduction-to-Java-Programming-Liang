/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4. Programming Exercises 4.25, 179*/
public class GenerateVehiclePlateNumbers {
    public static void main(String[] args) {
        //initialize a string for plate number
        String plateNumber = "";

        //Generate random uppercase letters and digits for the vehicle plate
        char firstLetter = (char) (65 + (int) (Math.random()*26));
        char secondLetter = (char) (65 + (int) (Math.random()*26));
        char thirdLetter = (char) (65 + (int) (Math.random()*26));
        int firstDigit = (int) (Math.random()*10);
        int secondDigit = (int) (Math.random()*10);
        int thirdDigit = (int) (Math.random()*10);
        int fourthDigit = (int) (Math.random()*10);

        //create the plate number with this letter and digit combination
        plateNumber = plateNumber + firstLetter + secondLetter + thirdLetter + firstDigit + secondDigit + thirdDigit + fourthDigit;

        //display the result
        System.out.print(plateNumber);
    }
}
