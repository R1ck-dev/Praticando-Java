import java.util.Locale;
import java.util.Scanner;

public class MelhorAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US); 

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if (a > b) {
            System.out.println("Paulo");
        } else {
            System.out.println("Pedro");
        }

        sc.close();
    }
}
