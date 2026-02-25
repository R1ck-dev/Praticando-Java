import java.util.Scanner;

public class Teleferico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        int a = sc.nextInt();
        int count = 0;

        while (a > 0) {
            a -= (c-1);
            count++;
        }

        System.out.println(count);
        sc.close();
    }
}
