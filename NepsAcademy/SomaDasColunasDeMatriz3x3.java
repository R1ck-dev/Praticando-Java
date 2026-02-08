import java.util.Scanner;

public class SomaDasColunasDeMatriz3x3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int[] colSum = {0, 0, 0};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[j][i] = sc.nextInt();
                colSum[j] += matriz[j][i];
            }
        }

        System.out.println("Coluna 0: " + colSum[0]);
        System.out.println("Coluna 1: " + colSum[1]);
        System.out.println("Coluna 2: " + colSum[2]);
        sc.close();
    }
}
