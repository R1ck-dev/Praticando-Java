import java.util.Scanner;

public class ExpressoesAritmeticos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maiorResultado = 0;

        if (a + b + c > maiorResultado) {
            maiorResultado = a + b + c;
        }

        if (a * b * c > maiorResultado) {
            maiorResultado = a * b * c;
        }

        if (a + (b * c) > maiorResultado) {
            maiorResultado = a + (b * c);
        }

        if ((a * b) + c > maiorResultado) {
            maiorResultado = (a * b) + c;
        }

        if (a * (b + c) > maiorResultado) {
            maiorResultado = a * (b + c);
        }

        if ((a + b) * c > maiorResultado) {
            maiorResultado = ((a + b) * c); 
        }

        System.out.println(maiorResultado);
        sc.close();
    }
}
