/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.14, 261*/
public class EstimatePi {
    public static void main(String[] args) {
        estimatePITable();
    }

    public static void estimatePITable(){
        estimatePITableHeader();
        estimatePITableBody();
    }

    public static void estimatePITableHeader(){
        System.out.print("i \t\t\t\t m(i)\n" +
                "----------------------------\n");
    }

    public static void estimatePITableBody(){
        double pi = 0;

        //to calculate the sum of series
        for (int i = 1; i <= 901; i++){
            //the rule of the series
            pi += 4 * (Math.pow(-1, (i + 1))) / (2 * i - 1);

            //to display the rows that has the i value 1, 101, 201, ..., 901
            if (i % 100 == 1){
                System.out.printf("%-3d \t\t\t %6.4f\n", i, pi);
            }
        }
    }
}
