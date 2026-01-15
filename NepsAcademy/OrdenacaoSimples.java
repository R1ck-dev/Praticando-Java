import java.util.Arrays;
import java.util.Scanner;

public class OrdenacaoSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] valuesList = new int[n];

        for (int i = 0; i < n; i++) {
            valuesList[i] = sc.nextInt();
        }

        Arrays.sort(valuesList);

        for (int value : valuesList) {
            System.out.print(value + " ");
        }

        sc.close();
    }
}
