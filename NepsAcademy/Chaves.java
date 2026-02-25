import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Chaves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtdLinhas = sc.nextInt();
        sc.nextLine();
        List<String> linhas = new ArrayList<>();
        Stack<Character> pilha = new Stack<>();
        Boolean finalResult = true;

        for (int i = 0; i < qtdLinhas; i++) {
            linhas.add(sc.nextLine());
        }

        for (int i = 0; i < linhas.size(); i++) {
            for (int j = 0; j < linhas.get(i).length(); j++) {
                String stringAtual = linhas.get(i);
                if (stringAtual.charAt(j) == '{') {
                    pilha.push(stringAtual.charAt(j));
                } else if (stringAtual.charAt(j) == '}') {
                    if (pilha.isEmpty()) {
                        finalResult = false;
                        break;
                    } else {
                        pilha.pop();
                    }
                }
            }
        }

        if (!pilha.isEmpty()) finalResult = false;

        // System.out.println(linhas);
        String output = (finalResult) ? "S" : "N";
        System.out.println(output);

        sc.close();
    }
}
