import java.util.Arrays;
import java.util.Scanner;

public class Poquemao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int count = 0;

        Integer[] list = {x, y, z};

        Arrays.sort(list);

        for (Integer number : list) {
            if (n < number) {
                break;
            } else {
                count++;
                n = n - number;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
