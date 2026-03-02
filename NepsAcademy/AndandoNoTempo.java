import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AndandoNoTempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> verificaIgual = new HashSet<>();
        int a = sc.nextInt();
        verificaIgual.add(a);
        int b = sc.nextInt();
        verificaIgual.add(b);
        int c = sc.nextInt();
        verificaIgual.add(c);

        boolean possivel = false;

        if (verificaIgual.size() == 2) possivel = true;
        if (verificaIgual.size() == 1) possivel = true;

        if (possivel == false) {
            int[] listaOrdenada = {a, b, c};
            Arrays.sort(listaOrdenada);
            int maior = listaOrdenada[2];
            int sub = listaOrdenada[0] + listaOrdenada[1];
            if (maior - sub == 0) {
                possivel = true;
            }
        }

        if (possivel) {
            System.out.println("S");
        } else System.out.println("N");

        sc.close();
    }
}
