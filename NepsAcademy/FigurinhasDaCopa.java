import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FigurinhasDaCopa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int qtdEspacos = sc.nextInt();
        int qtdRaras = sc.nextInt();
        int qtdCompradas = sc.nextInt();

        int[] numRaras = new int[qtdRaras];
        for (int i = 0; i < qtdRaras; i++) {
            numRaras[i] = sc.nextInt();
        }

        // Contains em um set é mais eficiente
        Set<Integer> compradas = new HashSet<>();
        for (int i = 0; i < qtdCompradas; i++) {
            compradas.add(sc.nextInt());
        }

        int faltando = 0;
        for (int rara : numRaras) {
            if (!compradas.contains(rara)) {
                faltando++;
            }
        }

        System.out.println(faltando);
        sc.close();
    }
}