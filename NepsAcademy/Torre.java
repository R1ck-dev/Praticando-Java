// import java.util.Arrays;
import java.util.Scanner;

public class Torre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] board = new int[n][n];
        int[] rowSum = new int[n];
        int[] colSum = new int[n];
        int sum = 0;
        int maxWeight = 0;
        int currentWeight = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        // Soma linhas
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += board[i][j];
            }
            rowSum[i] = sum;
            sum = 0;
        }

        // Soma colunas
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += board[j][i];
            }
            colSum[i] = sum;
            sum = 0;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                currentWeight = (rowSum[i] + colSum[j]) - (board[i][j]*2);
                if (currentWeight > maxWeight) {
                    maxWeight = currentWeight;
                }
                currentWeight = 0;
            }
        }

        // System.out.println(Arrays.toString(rowSum));
        // System.out.println(Arrays.toString(colSum));
        System.out.println(maxWeight);

        sc.close();
    }
}
