/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
8.5 Case Study: Grading a Multiple-Choice Exam, 319*/
public class GradeExam {
    public static void main(String[] args) {
        //Students' answers to the questions, 2-D Array
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        //Key to the questions, 1-D Array
        char[] keys =  {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        //Grade all answers
        for (int i = 0; i < answers.length; i++){
            //Grade one student
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++){
                if (answers[i][j] == keys[j]){
                    correctCount++;
                }
            }

            //display the result
            System.out.println("Student " + i + "'s correct count is " + correctCount);
        }
    }
}
