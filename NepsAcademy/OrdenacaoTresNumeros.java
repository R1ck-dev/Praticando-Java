import java.util.Arrays;
import java.util.Scanner;

public class OrdenacaoTresNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] order = { a, b, c };

        Arrays.sort(order);

        for (int value : order) {
            System.out.println(value);
        }

        sc.close();
    }
}
