import java.util.Scanner;
import java.util.Stack;

public class Expressao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while (T-- > 0) {
            String expressao = sc.next();
            if (ehValida(expressao)) {
                System.out.println("S");
            } else {
                System.out.println("N");
            }
        }
        sc.close();
    }

    public static boolean ehValida(String s) {
        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                pilha.push(c);
            } 
            else {
                if (pilha.isEmpty()) return false;

                // Recebe/Elimina o topo da pilha
                // Agora a variável tem o topo, e pode ser comparada
                // Nesse caso, o pop pode acontecer, pq se ela estiver fechando errado, a execução já se encerra e retorna false
                char topo = pilha.pop(); 
                
                if (c == ')' && topo != '(') return false;
                if (c == ']' && topo != '[') return false;
                if (c == '}' && topo != '{') return false;
            }
        }

        return pilha.isEmpty();
    }
}