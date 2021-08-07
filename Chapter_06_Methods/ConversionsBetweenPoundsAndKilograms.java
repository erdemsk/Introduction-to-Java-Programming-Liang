/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.9, 260*/
public class ConversionsBetweenPoundsAndKilograms {
    public static void main(String[] args) {
        printConversionTable();
    }

    public static void printConversionTable(){
        printConversionTableHeader();
        printConversionTableBody();
    }

    //header of the table
    public static void printConversionTableHeader(){
        System.out.print("Kilograms \t\t Pounds \t\t | \t\t Pounds \t Kilograms \n" +
                "------------------------------------------------------------------\n");
    }

    //body of the table
    public static void printConversionTableBody(){
        for (int kilograms = 1, pounds = 20; kilograms <= 199; kilograms +=2, pounds += 5){
            System.out.printf("%-3d \t\t\t %-5.1f \t\t\t | \t\t %-3d \t\t\t %-6.2f\n", kilograms, kilogramToPound(kilograms), pounds, poundToKilogram(pounds));
        }
    }

    //convert pounds to kilograms
    public static double poundToKilogram (double pound){
        return pound * 0.453;
    }

    //convert kilograms to pounds
    public static double kilogramToPound(double kilogram){
        return kilogram * 2.204;
    }
}
