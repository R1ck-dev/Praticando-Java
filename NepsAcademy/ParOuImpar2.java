import java.util.Scanner;

public class ParOuImpar2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();

        if (p == 0) {
            if ((d1 + d2) % 2 == 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        } else {
            if ((d1 + d2) % 2 == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

        sc.close();
    }
}
