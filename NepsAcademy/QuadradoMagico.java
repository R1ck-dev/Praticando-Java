import java.util.Scanner;

public class QuadradoMagico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] square = new int[n][n];
        int sum = 0;
        int trueValue = 0;
        boolean isPerfect = true;

        // Inicia quadrado
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                square[i][j] = sc.nextInt();
                if (i == 0) {
                    trueValue += square[i][j];
                }
            }
        }

        // Verifica linha
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += square[i][j];
            }
            if (sum != trueValue) {
                isPerfect = false;
                break;
            }
            sum = 0;
        }

        // Verifica coluna
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += square[j][i];
            }
            if (sum != trueValue) {
                isPerfect = false;
                break;
            }
            sum = 0;
        }

        // Verifica diagonal inversa
        for (int i = 0; i < n; i++) {
            sum += square[i][n - 1 - i];
        }

        if (sum != trueValue) {
            isPerfect = false;
        }
        sum = 0;

        // Verifica diagonal
        for (int i = 0; i < n; i++) {
            sum += square[i][i];
        }

        if (sum != trueValue) {
            isPerfect = false;
        }
        sum = 0;

        if (isPerfect) {
            System.out.println(trueValue);
        } else {
            System.out.println(-1);
        }

        sc.close();
    }
}
