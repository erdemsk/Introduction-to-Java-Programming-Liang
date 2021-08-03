/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6.4 void vs. Value-Returning Methods, 233-234*/
public class TestReturnGradeMethod {
    public static void main(String[] args) {
        System.out.print("The grade is " + getGrade (78.5));
        System.out.print("\nThe grade is " + getGrade (59.5));
    }
    //define the getGrade() method
    public static char getGrade (double score){
        if (score >= 90){
            return 'A';
        }
        else if (score >= 80){
            return 'B';
        }
        else if (score >= 70){
            return 'C';
        }
        else if (score >= 60){
            return 'D';
        }
        else {
            return 'F';
        }
    }
}
