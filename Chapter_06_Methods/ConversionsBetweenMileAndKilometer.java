/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
6. Programming Exercises 6.8, 259*/
public class ConversionsBetweenMileAndKilometer {
    public static void main(String[] args) {
        printConversionTable();
    }

    public static void printConversionTable(){
        printConversionTableHeader();
        printConversionTableBody();
    }
    public static void printConversionTableHeader(){
        //display the header of the table
        System.out.print("Miles \t Kilometers\t\t | \t\t Kilometers \t Miles\n" +
                "---------------------------------------------------------\n");
    }
    public static void printConversionTableBody(){
        //print the header via mileToKilometer() and KilometerToMile() methods
        for (int mile = 1, kilometer = 20; mile <=10; mile++, kilometer += 5){
            System.out.printf("%d \t\t %-6.3f \t\t | \t\t %d \t\t\t %6.3f\n", mile, miloToKilometer(mile), kilometer, kilometerToMile(kilometer));
        }
    }

    public static double miloToKilometer(double mile){
        return mile * 1.609;
    }

    public static double kilometerToMile(double kilometer){
        return kilometer / 1.609;
    }
}
