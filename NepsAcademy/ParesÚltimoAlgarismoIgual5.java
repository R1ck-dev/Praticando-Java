import java.util.Scanner;

public class ParesÚltimoAlgarismoIgual5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int count = 0;

        if (x % 2 == 0 || Math.abs(x % 10) == 5) {
            count++;
        }
        if (y % 2 == 0 || Math.abs(y % 10) == 5) {
            count++;
        }
        if (z % 2 == 0 || Math.abs(z % 10) == 5) {
            count++;
        }

        System.out.println(count);
        sc.close();
    }
}
