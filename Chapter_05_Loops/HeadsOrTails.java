/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.40, 223*/
public class HeadsOrTails {
    public static void main(String[] args) {
        final int NUMBER_OF_FLIPPING = 2000000;
        int heads = 0;
        int tails = 0;

        /*execute the loop for 2000000 times, each time create a random integer as either 0 or 1
        assign 0 to heads, and 1 to tails*/
        for (int i = 0; i < NUMBER_OF_FLIPPING; i++){
            //generate a random number
            int result = (int) (Math.random() * 2);

            if (result == 0){
                heads++;
            }

            //result == 1
            else{
                tails++;
            }
        }

        //display the result
        System.out.println("Heads " + heads + " - " + tails + " Tails");
    }
}
