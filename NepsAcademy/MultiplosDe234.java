import java.util.Scanner;

public class MultiplosDe234 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }

        int multiplo2 = 0;
        int multiplo3 = 0;
        int multiplo4 = 0;

        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 == 0) {
                multiplo2++;
            }
            if (list[i] % 3 == 0) {
                multiplo3++;
            }
            if (list[i] % 4 == 0) {
                multiplo4++;
            }
        }

        System.out.println(multiplo2);
        System.out.println(multiplo3);
        System.out.println(multiplo4);
        sc.close();
    }
}
