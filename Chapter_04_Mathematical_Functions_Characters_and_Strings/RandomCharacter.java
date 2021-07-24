/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4. Programming Exercises 4.16, 177*/
public class RandomCharacter {
    public static void main(String[] args) {
        //Create a random integer between 97 and 122
        int randomNumber = 97 + (int) (Math.random() * 26);

        //find the corresponding letter which has the ASCII code that is equal to the random number
        char correspondingLetter = (char) randomNumber;

        //display the result
        System.out.println("ASCII code of " + correspondingLetter + " is " + randomNumber);
    }
}
