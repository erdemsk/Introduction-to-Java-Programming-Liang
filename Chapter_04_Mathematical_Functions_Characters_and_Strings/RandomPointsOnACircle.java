/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4. Programming Exercises 4.6, 174*/
public class RandomPointsOnACircle {
    public static void main(String[] args) {
        int radius = 40;
        //generate a random radian value and calculate the x and y coordinates of angular points.
        double randomRadians = Math.toRadians(Math.random() * 360);
        double xOfA = radius * Math.cos(randomRadians);
        double yOfA = radius * Math.sin(randomRadians);
        //calculate the angle by inverse trigonometric functions
        double angleA = Math.acos(xOfA / radius);
        //display the result
        System.out.printf("Coordinates of Point A (%.3f,%.3f) and the A angle is %.3f", xOfA, yOfA, Math.toDegrees(angleA));
        System.out.println();

        randomRadians = Math.toRadians(Math.random() * 360);
        double xOfB = radius * Math.cos(randomRadians);
        double yOfB = radius * Math.sin(randomRadians);
        double angleB = Math.acos(xOfB / radius);
        System.out.printf("Coordinates of Point B (%.3f,%.3f) and the B angle is %.3f", xOfB, yOfB, Math.toDegrees(angleB));
        System.out.println();

        randomRadians = Math.toRadians(Math.random() * 360);
        double xOfC = radius * Math.cos(randomRadians);
        double yOfC = radius * Math.sin(randomRadians);
        double angleC = Math.acos(xOfC / radius);
        System.out.printf("Coordinates of Point C (%.3f,%.3f) and the C angle is %.3f", xOfC, yOfC, Math.toDegrees(angleC) );
        System.out.println();
    }
}
