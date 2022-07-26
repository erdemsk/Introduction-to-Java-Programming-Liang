/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
12.8 Chained Exceptions, 496*/
public class Checkpoint_12_08_01 {
    public static void main(String[] args) {
        try{
            method1();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static void method1() throws Exception{
        try{
            method2();
        }
        catch (Exception ex){
            throw new Exception("New info from method1");
        }
    }

    public static void method2() throws Exception{
        throw new Exception("New info from method2");
    }
}
