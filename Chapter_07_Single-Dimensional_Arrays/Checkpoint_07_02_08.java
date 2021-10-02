/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
7.2 Array Basics, 276*/
public class Checkpoint_07_02_08 {
    public static void main(String[] args) {
        //a
        double [] myArray = new double[10];

        //b
        myArray[myArray.length - 1] = 5.5;

        //c
        System.out.println(myArray[0] + myArray[1]);

        //d
        double sumOfElements = 0;
        for (int i = 0; i < myArray.length; i++){
            sumOfElements += myArray[i];
        }

        //d alternative
        double sumOfElementsAlternative = 0;
        for (double i : myArray) {
            sumOfElementsAlternative += i;
        }

        //e
        double minimumElement = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (minimumElement > myArray[i]) {
                minimumElement = myArray[i];
            }
        }

        //f
        System.out.println(myArray[(int) (Math.random() * myArray.length)]);

        //g
        double [] newArray = {3.5, 5.5, 4.52, 5.6};
    }
}
