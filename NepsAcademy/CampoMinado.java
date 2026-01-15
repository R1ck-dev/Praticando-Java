import java.util.Scanner;

public class CampoMinado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] minas = new int[n];
        int[] areaExplosao = new int[n];

        for (int i = 0; i < n; i++) {
            minas[i] = sc.nextInt();
        }

        for (int i = 0; i < minas.length; i++) {
            if (minas[i] == 1) {
                if (i == 0) {
                    areaExplosao[i+1] += 1;
                    areaExplosao[i] += 1;
                } else if (i == n-1) {
                    areaExplosao[i-1] += 1;
                    areaExplosao[i] += 1;
                } else {
                    areaExplosao[i-1] += 1;
                    areaExplosao[i] += 1;
                    areaExplosao[i+1] += 1;
                }
            }
        }

        for (int explosao : areaExplosao) {
            System.out.println(explosao);
        }

        sc.close();
    }
}
