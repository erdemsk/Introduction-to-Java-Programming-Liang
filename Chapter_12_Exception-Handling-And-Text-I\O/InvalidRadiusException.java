/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
12.9 Defining Custom Exception Classes, 496*/
public class InvalidRadiusException extends Exception{
    private double radius;

    //construct an exception
    public InvalidRadiusException(double radius){
        super("Invalid radius " + radius);
        this.radius = radius;
    }

    //return the radius
    public double getRadius(){
        return radius;
    }
}

