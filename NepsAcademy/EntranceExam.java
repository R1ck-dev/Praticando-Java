import java.util.Scanner;

public class EntranceExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int numberOfQuestions = sc.nextInt();
        String testTemplate = sc.next();
        String optionsByStudent = sc.next();
        int hits = 0;

        for (int i = 0; i < testTemplate.length(); i++) {
            if (testTemplate.charAt(i) == optionsByStudent.charAt(i)) {
                hits++;
            }
        }

        System.out.println(hits);
        sc.close();
    }
}
