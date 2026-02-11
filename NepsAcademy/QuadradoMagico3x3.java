import java.util.Scanner;

public class QuadradoMagico3x3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();
        int[][] square = new int[3][3];
        int sum = 0;
        int trueValue = 0;
        boolean isPerfect = true;

        // Inicia quadrado
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                square[i][j] = sc.nextInt();
                if (i == 0) {
                    trueValue += square[i][j];
                }
            }
        }

        // Verifica linha
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum += square[i][j];
            }
            if (sum != trueValue) {
                isPerfect = false;
                break;
            }
            sum = 0;
        }

        // Verifica coluna
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum += square[j][i];
            }
            if (sum != trueValue) {
                isPerfect = false;
                break;
            }
            sum = 0;
        }

        // Verifica diagonal inversa
        for (int i = 0; i < 3; i++) {
            sum += square[i][3 - 1 - i];
        }

        if (sum != trueValue) {
            isPerfect = false;
        }
        sum = 0;

        // Verifica diagonal
        for (int i = 0; i < 3; i++) {
            sum += square[i][i];
        }

        if (sum != trueValue) {
            isPerfect = false;
        }
        sum = 0;

        if (isPerfect) {
            System.out.println("SIM");
        } else {
            System.out.println("NAO");
        }

        sc.close();
    }
}
