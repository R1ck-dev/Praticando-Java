import java.util.Scanner;

public class Bondinho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int m = sc.nextInt();
        int soma = a+m;

        if (soma <= 50) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }

        sc.close();
    }
}
