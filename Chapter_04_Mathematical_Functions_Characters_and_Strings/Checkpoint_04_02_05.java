/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4.2 Common Mathematical Functions, 146*/
public class Checkpoint_04_02_05 {
    public static void main(String[] args) {
        //Create random numbers using Math.random() and arrange them to fit a certain interval by adding integer or double values
        int firstRandomNumber = 34 + (int) (Math.random()*22);
        int secondRandomNumber = (int) (Math.random()*1000);
        double thirdRandomNumber = 5.5 + (int) (Math.random()*50);

        //display the result
        System.out.println("A random integer between 34 and 55: "+firstRandomNumber);
        System.out.println("A random integer between 0 and 999: "+secondRandomNumber);
        System.out.println("A random integer between 5.5 and 55.5: "+thirdRandomNumber);

    }
}
