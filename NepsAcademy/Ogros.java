import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ogros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtdFaixasDePremiacao = sc.nextInt();
        int qtdOgrosMedidos = sc.nextInt();

        int[] valoresASeBater = new int[qtdFaixasDePremiacao-1];

        for (int i = 0; i < qtdFaixasDePremiacao-1; i++) {
            valoresASeBater[i] = sc.nextInt();
        }

        int[] premiacao = new int[qtdFaixasDePremiacao];

        for (int i = 0; i < qtdFaixasDePremiacao; i++) {
            premiacao[i] = sc.nextInt();
        }

        int[] resultadosOgros = new int[qtdOgrosMedidos];

        for (int i = 0; i < qtdOgrosMedidos; i++) {
            resultadosOgros[i] = sc.nextInt();
        }

        int countPremio = 0;
        List<Integer> resultadosPremiacao = new ArrayList<>();

        for (int i = 0; i < qtdOgrosMedidos; i++) {
            for (int j = 0; j < valoresASeBater.length; j++) {
                if (resultadosOgros[i] >= valoresASeBater[j]) {
                    countPremio++;
                } else break;
            }
            resultadosPremiacao.add(premiacao[countPremio]);
            countPremio = 0;
        }
        // Collections.sort(resultadosPremiacao, Collections.reverseOrder());
        // System.out.println(resultadosPremiacao);
        resultadosPremiacao.stream()
                .forEach(resultado -> System.out.print(resultado + " "));
        sc.close();
    }
}