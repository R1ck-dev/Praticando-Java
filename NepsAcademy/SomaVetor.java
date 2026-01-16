import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] valuesList = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            valuesList[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            sum += valuesList[i];
        }

        System.out.println(sum);
        sc.close();
    }
}
