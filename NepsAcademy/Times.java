import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Times {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtdAlunos = sc.nextInt();
        int qtdTimes = sc.nextInt();
        Map<String, Integer> jogador = new HashMap<>();

        for (int i = 0; i < qtdAlunos; i++) {
            jogador.put(sc.next(), sc.nextInt());
        }

        Map<String, Integer> jogadoresOrdenados = new LinkedHashMap<>();

        jogador.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(entry -> jogadoresOrdenados.put(entry.getKey(), entry.getValue()));

        List<List<String>> listaDeTimes = new ArrayList<>();
        for (int i = 0; i < qtdTimes; i++) {
            listaDeTimes.add(new ArrayList<>());
        }

        int i = 0;
        for (String nome : jogadoresOrdenados.keySet()) {
            listaDeTimes.get(i % qtdTimes).add(nome); 
            i++;
        }

        for (int j = 0; j < qtdTimes; j++) {
            System.out.println("Time " + (j + 1));
            
            List<String> timeAtual = listaDeTimes.get(j);
            Collections.sort(timeAtual);
            
            for (String nomeJogador : timeAtual) {
                System.out.println(nomeJogador);
            }
            
            System.out.println();
        }

        sc.close();
    }
}

// Versão Otimizada

// import java.util.*;

// public class Times {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int qtdAlunos = sc.nextInt();
//         int qtdTimes = sc.nextInt();
        
//         // Usamos uma lista de objetos ou Map.Entry para ordenar por habilidade
//         List<Map.Entry<String, Integer>> listaJogadores = new ArrayList<>();

//         for (int i = 0; i < qtdAlunos; i++) {
//             String nome = sc.next();
//             int habilidade = sc.nextInt();
//             listaJogadores.add(new AbstractMap.SimpleEntry<>(nome, habilidade));
//         }

//         // 1. Ordenar por habilidade (Decrescente: do melhor para o pior)
//         listaJogadores.sort((a, b) -> b.getValue().compareTo(a.getValue()));

//         // 2. Criar a estrutura dos times
//         List<List<String>> times = new ArrayList<>();
//         for (int i = 0; i < qtdTimes; i++) {
//             times.add(new ArrayList<>());
//         }

//         // 3. Distribuir os jogadores (Round Robin)
//         for (int i = 0; i < listaJogadores.size(); i++) {
//             times.get(i % qtdTimes).add(listaJogadores.get(i).getKey());
//         }

//         // 4. Imprimir cada time
//         for (int j = 0; j < qtdTimes; j++) {
//             System.out.println("Time " + (j + 1));
            
//             // O enunciado exige ordem alfabética dos nomes DENTRO do time
//             Collections.sort(times.get(j));
            
//             for (String nome : times.get(j)) {
//                 System.out.println(nome);
//             }
//             // Linha em branco após cada time
//             System.out.println();
//         }
        
//         sc.close();
//     }
// }