import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class EstrategiaGulosa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] s = { 1, 5, 10, 25, 50, 100 };
        Collections.reverse(Arrays.asList(s));
        int v = sc.nextInt();
        int minimal = 0;
        int i = 0;

        while (v > -1) {
            if (v >= s[i]) {
                minimal += v/s[i];
                v -= (v / s[i]) * s[i];
            } else {
                i++;
                continue;
            }
            if (v <= 0) {
                break;
            }
            i++;
        }

        System.out.println(minimal);
        sc.close();
    }
}
