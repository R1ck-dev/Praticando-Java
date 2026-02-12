import java.util.Scanner;

public class SomaDasDiagonais3x3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int sumPrincipal = 0;
        int sumSecundary = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            sumSecundary += matriz[i][3 - 1 - i];
        }

        for (int i = 0; i < 3; i++) {
            sumPrincipal += matriz[i][i];
        }

        System.out.println("Diagonal principal: " + sumPrincipal);
        System.out.println("Diagonal secundaria: " + sumSecundary);
        sc.close();
    }
}
