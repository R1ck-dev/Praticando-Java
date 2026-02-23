import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ZeroParaCancelar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        Deque<Integer> pilha = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int valor = sc.nextInt();
            
            if (valor == 0) {
                if (!pilha.isEmpty()) {
                    pilha.pop();
                }
            } else {
                pilha.push(valor);
            }
        }

        long somaTotal = 0;
        for (int num : pilha) {
            somaTotal += num;
        }

        System.out.println(somaTotal);
        sc.close();
    }
}