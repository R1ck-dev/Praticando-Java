import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bino = sc.nextInt();
        int cino = sc.nextInt();
        int soma = bino+cino;

        if ((soma % 2) == 0) {
            System.out.println("Bino");
        } else {
            System.out.println("Cino");
        }

        sc.close();
    }
}
