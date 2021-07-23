/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
3. Programming Exercises 3.16, 133*/
public class RandomPoint {
    public static void main(String[] args) {
        //Create random numbers as coordinates for the rectangle which is centred at (0, 0) with width 50 and height 150
        double width = (int) ((-25 + (Math.random() * 51))*100)/100.0;
        double heigth = (int) ((-75 + (Math.random() * 151))*100)/100.0;

        // to prevent creating random numbers that are out of rectangle's boundary for example greater than 25 or less than -25 for x-Axis coordinates
        if (width > 25 || width < -25){
            width = (int) width/1.0;
        }
        if (heigth > 75 || heigth < -75){
            heigth = (int) heigth/1.0;
        }

        //display the result
        System.out.println("Coordinates of point X is (" + width + "," + heigth + ")");
    }
}
