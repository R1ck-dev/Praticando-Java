import java.util.Scanner;

public class BotasTrocadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] botasE = new int[61];
        int[] botasD = new int[61];

        for (int i = 0; i < n; i++) {
            int tamanho = sc.nextInt();
            char lado = sc.next().charAt(0);

            if (lado == 'E') {
                botasE[tamanho]++;
            } else {
                botasD[tamanho]++;
            }
        }

        int totalPares = 0;

        for (int i = 30; i <= 60; i++) {
            totalPares += Math.min(botasE[i], botasD[i]);
        }

        System.out.println(totalPares);

        sc.close();
    }
}