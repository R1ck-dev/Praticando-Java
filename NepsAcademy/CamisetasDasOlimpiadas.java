import java.util.Scanner;

public class CamisetasDasOlimpiadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtdPremiados = sc.nextInt();
        int[] tamanhosSolicitados = new int[qtdPremiados];

        int pequenasSolicitadas = 0;
        int mediasSolicitadas = 0;

        for (int i = 0; i < qtdPremiados; i++) {
            int tamanhoSolicitado = sc.nextInt();
            
            if (tamanhoSolicitado == 1) {
                pequenasSolicitadas++;
            } else mediasSolicitadas++;

            tamanhosSolicitados[i] = tamanhoSolicitado;
        }

        int pequenasProduzidas = sc.nextInt();
        int mediasProduzidas = sc.nextInt();

        if (pequenasSolicitadas == pequenasProduzidas && mediasSolicitadas == mediasProduzidas) {
            System.out.println("S");
        } else System.out.println("N");

        sc.close();
    }
}
