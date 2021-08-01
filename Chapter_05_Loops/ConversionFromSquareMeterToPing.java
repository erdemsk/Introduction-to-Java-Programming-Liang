/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
5. Programming Exercises 5.6, 217*/
public class ConversionFromSquareMeterToPing {
    public static void main(String[] args) {
        final int LAST_PING = 80;
        final int LAST_SQUARE_METER = 100;

        System.out.printf("Ping\t\tSquare meter\t|\tSquare meter\t\t\t\tPing");
        for (int ping = 10, squareMeter = 30; ping <= LAST_PING && squareMeter <= LAST_SQUARE_METER;
             ping = ping + 5, squareMeter = squareMeter + 5){
            System.out.printf("\n%d\t\t\t\t %7.3f\t|\t%d \t\t\t\t\t\t  %6.3f", ping, ping * 3.305, squareMeter, squareMeter / 3.305);
        }
    }
}
