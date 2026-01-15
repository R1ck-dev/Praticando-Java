import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AIdadeDeDonaMonica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        Integer[] idadesOrdenadas = {a, b, m-(a+b)};

        Arrays.sort(idadesOrdenadas, Collections.reverseOrder());

        System.out.println(idadesOrdenadas[0]);

        sc.close();
    }
}
