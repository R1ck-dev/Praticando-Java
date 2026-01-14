import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 0 || n == 1) {
            System.out.println(1);
        } else {
            int anterior = 1;
            int atual = 1;
            int proximo = 0;

            for (int i = 2; i <= n; i++) {
                proximo = anterior + atual;
                anterior = atual;
                atual = proximo;
            }
            System.out.println(proximo);
        }

        sc.close();

    }
}
