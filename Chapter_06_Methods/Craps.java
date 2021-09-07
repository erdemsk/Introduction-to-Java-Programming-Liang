/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.30, 265*/
public class Craps {
    public static void main(String[] args) {
        craps();
    }

    public static void craps(){
        int diceOne = (int) (Math.random() * 6) + 1;
        int diceTwo = (int) (Math.random() * 6) + 1;
        int sumOfDices = diceOne + diceTwo;

        //display the dices
        System.out.printf("You rolled %d + %d = %d\n", diceOne, diceTwo, sumOfDices);

        //check the "craps" scenario
        if (sumOfDices == 2 || sumOfDices == 3 || sumOfDices == 12){
            System.out.println("You lose!");
        }

        //check the "natural" scenario
        else if (sumOfDices == 7 || sumOfDices == 11){
            System.out.println("You win!");
        }

        //check if the sum of dices differ than 2, 3, 7, 11 and 12
        else{
            int point = sumOfDices;

            //display the point
            System.out.println("Point is " + point);

            while (true){
                diceOne = (int) (Math.random() * 6) + 1;
                diceTwo = (int) (Math.random() * 6) + 1;
                sumOfDices = diceOne + diceTwo;

                //if the sum of new dices is equal to the point
                if (sumOfDices == point){
                    System.out.println("You rolled " + sumOfDices + "\nYou win!");
                    break;
                }

                //if the sum of new dices is 7
                else if (sumOfDices == 7){
                    System.out.println("You rolled " + sumOfDices + "\nYou lose!");
                    break;
                }
            }
        }
    }
}
