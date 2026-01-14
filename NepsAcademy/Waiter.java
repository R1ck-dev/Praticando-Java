import java.util.Scanner;

public class Waiter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int brokenG = 0;

        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            int g = sc.nextInt();
            if (c > g) {
                brokenG += g;
            }
        }
        System.out.println(brokenG);
        sc.close();
    }
}
