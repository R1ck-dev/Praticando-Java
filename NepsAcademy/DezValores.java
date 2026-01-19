import java.util.Scanner;

public class DezValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            n++;
            System.out.print(n + " ");
        }

        sc.close();
    }
}