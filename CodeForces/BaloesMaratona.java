import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class BaloesMaratona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtdCasoTeste = sc.nextInt();
        int comprimentoString = 0;
        List<String> arrExerciciosResolvidos = new ArrayList<>();
        Set<Character> exercicio = new HashSet<>();

        for (int i = 0; i < qtdCasoTeste; i++) {
            comprimentoString = sc.nextInt();
            String exerciciosResolvidos = sc.next();
            for (int j = 0; j < exerciciosResolvidos.length(); j++) {
                exercicio.add(exerciciosResolvidos.charAt(j));
            }
            int pontuacao = (exercicio.size() * 2) + (exerciciosResolvidos.length() - exercicio.size());
            exercicio.clear();
            System.out.println(pontuacao); 
        }

        // System.out.println(arrExerciciosResolvidos);
        sc.close();
    }
}
