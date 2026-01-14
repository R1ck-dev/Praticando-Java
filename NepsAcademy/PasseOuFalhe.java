import java.util.Scanner;

public class PasseOuFalhe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double media = (nota1+nota2)/2;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 4) {
            System.out.println("Recuperacao");
        } else {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}