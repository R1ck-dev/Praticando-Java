import java.util.Arrays;
import java.util.Scanner;

public class CubosGravitacionais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtdColunas = sc.nextInt();
        int[] colunas = new int[qtdColunas];

        for (int i = 0; i < qtdColunas; i++) {
            colunas[i] = sc.nextInt();
        }

        Arrays.sort(colunas);

        for (int coluna : colunas) {
            System.out.print(coluna + " ");
        }

        sc.close();
    }
}
