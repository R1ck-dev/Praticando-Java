import java.util.Scanner;

public class TorreDeHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int teste = 1;

        while (true) {
            int n = sc.nextInt();
            
            if (n == 0) break;

            int movimentos = (int) Math.pow(2, n) - 1;

            System.out.println("Teste " + teste);
            System.out.println(movimentos);

            teste++;
        }
        sc.close();
    }
}