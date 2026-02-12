import java.util.Scanner;

public class Game10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();
        int a = sc.nextInt();

        if (a > d) {
            System.out.println((n-a)+d);
        } else {
            System.out.println(d-a);
        }

        sc.close();
    }
}
