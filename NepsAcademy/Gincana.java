import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gincana {

    static List<Integer>[] grafo;
    static boolean[] visitado;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtdAlunos = sc.nextInt();
        int qtdLinhas = sc.nextInt();

        grafo = new ArrayList[qtdAlunos+1]; // Iniciado primeiro Array
        visitado = new boolean[qtdAlunos+1];

        for (int i = 1; i <= qtdAlunos; i++) {
            grafo[i] = new ArrayList<>(); // Dentro do grande Array "grafo" será iniciado uma lista representando cada aluno. Lista no índice 1 será o aluno 1, assim por diante...
        }

        for (int i = 0; i < qtdLinhas; i++) {
            int aluno = sc.nextInt();
            int amigoDe = sc.nextInt();

            grafo[aluno].add(amigoDe); // Inseri que o aluno o qual vou informar o amigo. Dentro do grande Array "grafo" acesso a lista desse aluno pelo índice e adiciono o seu amigo. ex: 2 3 [ {}, index2{3}, {}, {}]
            grafo[amigoDe].add(aluno); // Também já faço o mesmo para o outro aluno, já que são amigos vice versa. [ {}, index2{3}, index3{2}, {}]
        }

        int contadorTimes = 0;

        for (int i = 1; i <= qtdAlunos; i++) {
            if (!visitado[i]) { // O Array de booleanos funciona semelhante, cada índice vai representar um aluno, índice 1 = aluno 1, etc... Eles são iniciados com falso, aqui vou até o índice que representa o aluno e verificar se ele foi verificado, se não, sei que vai representar um time novo.
                contadorTimes++;
                dfs(i);
            }
        }

        System.out.println(contadorTimes);
        sc.close();
    }

    public static void dfs(int aluno) {
        visitado[aluno] = true; // Entrando no Array dos alunos visitados, marco que aquele aluno foi visitado, mudando seu índice para true

        for (int vizinho : grafo[aluno]) { // Aqui vou acessar o grande Array "grafo" que contém a lista de amigos de cada aluno, lembrando que nesse Array, cada representa uma lista de amigos do aluno. Acessando a lista de amigos do aluno de índice indicado, passo um por um. Entrando no vizinho, aproveito para conferir se ele já foi visitado, se não, visito ele, aprofundando até encontrar o final.
            if (!visitado[vizinho]) {
                dfs(vizinho);
            }
        }
    }
}
