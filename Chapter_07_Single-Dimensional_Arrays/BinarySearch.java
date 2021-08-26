/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
7.13 Command-Line Arguments, 298*/
public class BinarySearch {
    public static void main(String[] args) {
        //Check the number of Strings passed
        if (args.length != 3){
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(1);
        }

        //The result of the operation
        int result = 0;

        //determine the operator
        switch (args[1].charAt(0)){
            case '+': result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]); break;
            case '-': result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]); break;
            case '.': result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]); break;
            case '/': result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]); break;
        }

        //display the result
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
    }
}
