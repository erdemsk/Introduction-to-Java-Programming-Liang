/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 4.6 Formatting Console Output, 171*/
public class Checkpoint_04_06_03 {
    public static void main(String[] args) {
        System.out.printf("amount is %f %e\n", 32.32, 32.32);
        System.out.printf("amount is %5.2f%% %5.4e\n", 32.327, 32.32);
        System.out.printf("%6b\n", (1>2));
        System.out.printf("%6s\n", "Java");
        System.out.printf("%-6b %s\n", (1>2), "Java");
        System.out.printf("%-6b %-8s\n", (1>2), "Java");
        System.out.printf("%,5d %,6.1f\n", 312342, 315562.932);
        System.out.printf("%05d %06.1f\n", 32, 32.32);
    }
}
