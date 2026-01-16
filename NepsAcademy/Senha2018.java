import java.util.Scanner;

public class Senha2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int errorCount = 0;
        boolean logic = true;

        while (logic) {
            int guess = sc.nextInt();
            if (guess == 2018) {
                System.out.println(errorCount);
                logic = false;
            } else {
                errorCount++;
            }
        }

        sc.close();
    }
}
