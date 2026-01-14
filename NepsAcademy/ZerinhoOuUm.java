import java.util.Scanner;

public class ZerinhoOuUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && a == c && b == c) {
            System.out.println("*");
        } else if (a != b && a != c) {
            System.out.println("A");
        } else if (b != a && b != c) {
            System.out.println("B");
        } else if (c != a && c != b) {
            System.out.println("C");
        }

        sc.close();
    }
}
