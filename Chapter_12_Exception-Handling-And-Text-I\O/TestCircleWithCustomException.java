/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
12.9 Defining Custom Exception Classes, 497*/
public class TestCircleWithCustomException {
    public static void main(String[] args) {
        try{
            new CircleWithCustomException(5);
            new CircleWithCustomException(-5);
            new CircleWithCustomException(0);
        }
        catch (InvalidRadiusException ex){
            System.out.println(ex);
        }

        System.out.println("Number of objects created: " + CircleWithCustomException.getNumberOfObjects());
    }
}

class CircleWithCustomException {
    //the radius of the circle
    private double radius;

    //the number of objects created
    private static int numberOfObjects = 0;

    //construct a circle with radius 1
    public CircleWithCustomException() throws InvalidRadiusException{
        this(1.0);
    }

    //construct a circle with a specified radius
    public CircleWithCustomException(double newRadius) throws InvalidRadiusException{
        setRadius(newRadius);
        numberOfObjects++;
    }

    //return radius
    public double getRadius(){
        return radius;
    }

    //set a new radius
    public void setRadius(double newRadius) throws InvalidRadiusException{
        if(newRadius >= 0){
            radius = newRadius;
        }
        else{
            throw new InvalidRadiusException(newRadius);
        }
    }

    //return numberOfObjects
    public static int getNumberOfObjects(){
        return numberOfObjects;
    }

    //return the area of this circle
    public double findArea(){
        return radius * radius * 3.14159;
    }
}
