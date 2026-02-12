import java.util.Arrays;
import java.util.Scanner;

public class PlantacaoDeMorangos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] areas = new int[2];

        for (int i = 0; i < 2; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            areas[i] = a * b;
        }

        Arrays.sort(areas);

        System.out.println(areas[1]);
        sc.close();
    }
}
