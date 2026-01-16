import java.util.Scanner;

public class MinutosParaHorasEMinutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int h = m/60;
        int r = m%60;

        System.out.println(h);
        System.out.println(r);
        sc.close();
    }
}
