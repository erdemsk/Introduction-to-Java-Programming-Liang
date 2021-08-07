/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.13, 261*/
public class SumSeries {
    public static void main(String[] args) {
        sumSeriesTable();
    }

    //invoke the header and body methods for the table
    public static void sumSeriesTable(){
        sumSeriesTableHeader();
        sumSeriesTableBody();
    }

    //header of the table
    public static void sumSeriesTableHeader(){
        System.out.print("I \t\t\t m(i)\n" +
                "----------------------------\n");
    }

    //body of the table, computes the series with the rule (i / i+2) and has 20 entry
    public static void sumSeriesTableBody (){
        final int NUMBER_0F_ENTRY = 20;
        double sum = 0;
        for (double i = 1; i <= NUMBER_0F_ENTRY; i++){
            sum = sum + i / (i + 2);
            System.out.printf("%d \t\t\t %7.4f\n", (int) i, sum);
        }
    }
}
