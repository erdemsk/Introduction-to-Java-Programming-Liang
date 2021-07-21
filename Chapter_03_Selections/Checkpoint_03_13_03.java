/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3.13 switch Statements, 125*/
public class Checkpoint_03_13_03 {
    public static void main(String[] args) {
        int x = 1;
        int a = 3;

        switch (a){
            case 1: x+=5; break;
            case 2: x+=10; break;
            case 3: x+=16; break; //this case is going to get executed.
            case 4: x+=34; break;
        }
        System.out.println(x);

    }
}
