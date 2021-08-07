/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.11, 260*/
public class ComputeCommissions {
    public static void main(String[] args) {
        commissionTable();
    }

    public static void commissionTable(){
        commissionTableHeader();
        commissionTableBody();
    }

    //header of the table
    public static void commissionTableHeader(){
        System.out.print("Sales Amount \t\t Commission\n" +
                "-----------------------------------\n");
    }

    //body of the table
    public static void commissionTableBody(){
        for (int salesAmount = 10000; salesAmount <= 100000; salesAmount += 5000){
            System.out.printf("%d \t\t\t\t %7.1f\n", salesAmount, computeCommission(salesAmount));
        }
    }

    //computing the commission amount
    public static double computeCommission(double salesAmount){
        double commissionAmount;

        /*these are the commission rates that belong to referred programming exercise (5.39),
        commission rates weren't clear in 6.11 so I used the referred scheme*/
        if (salesAmount >= 0.01 && salesAmount <= 5000){
            commissionAmount = salesAmount * 0.06;
        }
        else if (salesAmount >= 5000.01 && salesAmount <= 10000){
            commissionAmount = 5000 * 0.06 + (salesAmount - 5000) * 0.08;
        }
        else {
            commissionAmount = 5000 * 0.06 + 5000 * 0.08 + (salesAmount - 10000) * 0.1;
        }
        return commissionAmount;
    }
}
