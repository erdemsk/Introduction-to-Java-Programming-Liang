//Introduction to Java Programming and Data Structures, Liang, 11th Edition, 2.2 Writing a Simple Program, 57-58
public class ComputeArea {
    public static void main(String[] args) {
        double radius; //declare radius
        double area; //declare area

        radius=20; //assigning a value to radius
        area=radius*radius*3.14159; //computing the area

        //displaying the result
        System.out.println("The area for the circle of radius "+radius+" is: "+area);
    }

}
