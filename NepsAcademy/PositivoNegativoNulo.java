import java.util.Scanner;

public class PositivoNegativoNulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("negativo");
        } else if (n > 0) {
            System.out.println("positivo");
        } else {
            System.out.println("nulo");
        }

        sc.close();
    }
}
