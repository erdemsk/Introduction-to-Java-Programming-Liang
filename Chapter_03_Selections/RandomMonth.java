/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
 3. Programming Exercises 3.4, 131*/
public class RandomMonth {
    public static void main(String[] args) {
        /* (int) (Math.random()*12) returns a random integer between 0 and 11,
            add 1 to it and you'll have a random integer between 1 and 12*/
        int randomNumber = (int) (Math.random()*12);
        randomNumber +=1;

        switch (randomNumber){
            case 1: System.out.println("January"); break;
            case 2: System.out.println("February"); break;
            case 3: System.out.println("March"); break;
            case 4: System.out.println("April"); break;
            case 5: System.out.println("May"); break;
            case 6: System.out.println("June"); break;
            case 7: System.out.println("July"); break;
            case 8: System.out.println("August"); break;
            case 9: System.out.println("September"); break;
            case 10: System.out.println("October"); break;
            case 11: System.out.println("November"); break;
            case 12: System.out.println("December"); break;
        }
    }
}
