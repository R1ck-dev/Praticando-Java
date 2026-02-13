import java.util.Arrays;
import java.util.Scanner;

public class MaquinaDeCafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();


        int inA1 = (a2 * 2) + (a3 * 4); // a1 -> a2, a3
        int inA2 = (a1 * 2) + (a3 * 2); // a2 -> a1, a3
        int inA3 = (a2 * 2) + (a1 * 4); // a3 -> a1, a2

        int[] sorted = {inA1, inA2, inA3};
        Arrays.sort(sorted);

        System.out.println(sorted[0]);
        sc.close();
    }
}
