/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.38, 268*/
public class GenerateRandomCharacters {
    public static void main(String[] args) {
        final int TOTAL_NUMBER_OF_UPPERCASE_LETTERS = 200;
        final int TOTAL_NUMBER_OF_DIGITS = 200;

        int numberOfUppercaseLetters = 0, numberOfDigits = 0;

        for (int i = 0; i < TOTAL_NUMBER_OF_UPPERCASE_LETTERS; i++){
            //if there are already 10 uppercase letters in the line, move to the next line
            if (numberOfUppercaseLetters % 10 == 0){
                System.out.println();
            }
            //display a random uppercase letter
            System.out.print(getRandomUppercaseLetter() + " ");
            numberOfUppercaseLetters++;
        }

        for (int j = 0; j < TOTAL_NUMBER_OF_DIGITS; j++){
            //if there are already 10 digits in the line, move to the next line
            if (numberOfDigits % 10 == 0){
                System.out.println();
            }
            //display a random digit
            System.out.print(getRandomDigitCharacter() + " ");
            numberOfDigits++;
        }

    }

    //Generate a random character between ch1 and ch2
    public static char getRandomCharacter(char ch1, char ch2){
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    //Generate a random digit
    public static char getRandomDigitCharacter(){
        return getRandomCharacter('0','9');
    }

    //Generate a random uppercase letter
    public static char getRandomUppercaseLetter(){
        return getRandomCharacter('A','Z');
    }
}
