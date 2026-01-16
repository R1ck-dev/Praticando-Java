import java.util.Scanner;

public class FitaColorida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] coloredWith0 = new int[n];
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            coloredWith0[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (coloredWith0[i] == 0) {
                
            }
        }


        sc.close();
    }
}
