/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3.13 switch Statements, 125*/
public class Checkpoint_03_13_02 {
    public static void main(String[] args) {
        int x,y;
        x=y=3;

        switch (x+3){
            case 6: y=1; //1 is assigned to y
            default: y+=1; //the value of y increased by 1
        }
        System.out.println("y is: "+y);
    }
}
