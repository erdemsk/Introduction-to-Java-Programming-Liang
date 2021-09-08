/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.32, 266*/
public class ChanceOfWinningAtCraps {
    public static void main(String[] args) {
        final int NUMBER_OF_PLAYS = 15000;
        int numberOfWins = 0, numberOfLosses = 0;

        //play the game for 15000 times
        for (int i = 0; i < NUMBER_OF_PLAYS; i++){
            int result = craps();

            //keep the winning and losing statistics
            if (result == 1){
                numberOfWins++;
            }

            else{
                numberOfLosses++;
            }
        }

        //display the result
        System.out.println("Number of wins is " + numberOfWins + ", and number of losses is " + numberOfLosses);
    }

    public static int craps(){
        //assign values to the dices
        int diceOne = (int) (Math.random() * 6) + 1;
        int diceTwo = (int) (Math.random() * 6) + 1;
        int sumOfDices = diceOne + diceTwo;

        //check the "craps" scenario
        if (sumOfDices == 2 || sumOfDices == 3 || sumOfDices == 12){
            return -1;
        }

        //check the "natural" scenario
        else if (sumOfDices == 7 || sumOfDices == 11){
            return 1;
        }

        //check if the sum of dices differ than 2, 3, 7, 11 and 12
        else{
            int point = sumOfDices;

            while (true){
                diceOne = (int) (Math.random() * 6) + 1;
                diceTwo = (int) (Math.random() * 6) + 1;
                sumOfDices = diceOne + diceTwo;

                //if the sum of new dices is equal to the point
                if (sumOfDices == point){
                    return 1;
                }

                //if the sum of new dices is 7
                else if (sumOfDices == 7){
                    return -1;
                }
            }
        }
    }
}
