import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String entrada;

        entrada = sc.nextLine();

        while (!entrada.isEmpty()) {
            System.out.println("Entrada: " + entrada);
            entrada = sc.nextLine();
        }

        System.out.println("Fim");
        sc.close();
    }
}
