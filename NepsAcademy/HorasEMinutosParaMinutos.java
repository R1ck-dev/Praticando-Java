import java.util.Scanner;

public class HorasEMinutosParaMinutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int result = (h*60)+m;

        System.out.println(result);

        sc.close();
    }
}