/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6.4 void vs. Value-Returning Methods, 233*/
public class TestVoidMethod {
    public static void main(String[] args) {
        System.out.print("The grade is ");
        printGrade (78.5); //Invoke the printGrade() method

        System.out.print("The grade is ");
        printGrade (59.5);
    }
    //define the printGrade() method
    public static void printGrade (double score){
        if (score >= 90.0){
            System.out.println('A');
        }
        else if (score >= 80.0){
            System.out.println('B');
        }
        else if (score >= 70.0){
            System.out.println('C');
        }
        else if (score >= 60.0){
            System.out.println('D');
        }
        else {
            System.out.println('F');
        }
    }
}
