import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSequencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> fibo = new ArrayList<>();

        fibo.add(0);
        fibo.add(1);

        if (n == 1) {
            System.out.println(0);
        } else if (n == 2) {
            System.out.println(0 + " " + 1);
        } else {
            int atual = 1;
            int anterior = 0;
            int proximo = atual + anterior;

            for (int i = 2; i < n; i++) {
                fibo.add(proximo);
                anterior = atual;
                atual = proximo;
                proximo = atual + anterior;
            }

            fibo.stream().forEach(value -> System.out.print(value + " "));
        }
        sc.close();
    }
}
