import java.util.Scanner;

public class SomaDasCasas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeCasas = sc.nextInt();
        int[] listaCasas = new int[quantidadeCasas];

        for (int i = 0; i < quantidadeCasas; i++) {
            listaCasas[i] = sc.nextInt();
        }

        int somaCasas = sc.nextInt();

        for (int i = 0; i < quantidadeCasas-1; i++) {
            for (int j = i+1; j < quantidadeCasas; j++) {
                if (listaCasas[i]+listaCasas[j] == somaCasas) {
                    System.out.println(listaCasas[i] + " " + listaCasas[j]);
                    break;
                }
            }
        }

        sc.close();
    }
}