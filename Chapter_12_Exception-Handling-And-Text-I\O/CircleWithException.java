/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
12.4.5 Example: Declaring, Throwing, and Catching Exceptions, 489*/
public class CircleWithException {
    //The radius of the circle
    private double radius;

    //the number of the objects created
    private static int numberOfObjects = 0;

    //construct a circle with radius 1
    public CircleWithException(){
        this(1.0);
    }

    //construct a circle with a specified radius
    public CircleWithException(double newRadius){
        setRadius(newRadius);
        numberOfObjects++;
    }

    //return radius
    public double getRadius(){
        return radius;
    }

    //set a new radius
    public void setRadius(double newRadius) throws IllegalArgumentException {
        if (newRadius >= 0) {
            radius = newRadius;
        } else {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
    }

    //return numberOfObjects
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    //return the area of this circle
    public double findArea(){
        return radius * radius * 3.14159;
    }
}
