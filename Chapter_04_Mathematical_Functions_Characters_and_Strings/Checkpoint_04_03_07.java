/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4.3 Character Data Type and Operations, 151*/
public class Checkpoint_04_03_07 {
    public static void main(String[] args) {
        //decimal code of lowercase letters range from 97 to 122
        int decimalCode = 97 + (int) (Math.random()*25);

        // create the character that has the randomly generated decimal value
        char lowercaseCharacter = (char) decimalCode;

        //display the result
        System.out.println("Decimal code of "+ lowercaseCharacter + " is " + decimalCode);
    }
}
