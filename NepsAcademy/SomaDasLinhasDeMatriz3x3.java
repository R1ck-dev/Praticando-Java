import java.util.Scanner;

public class SomaDasLinhasDeMatriz3x3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int[] rowSum = {0, 0, 0};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
                rowSum[i] += matriz[i][j];
            }
        }

        System.out.println("Linha 0: " + rowSum[0]);
        System.out.println("Linha 1: " + rowSum[1]);
        System.out.println("Linha 2: " + rowSum[2]);
        sc.close();
    }
}
