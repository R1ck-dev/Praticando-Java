import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CopaDoMundo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] teamsEntry = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P" };
        List<String> teams = new ArrayList<>(Arrays.asList(teamsEntry));

        // Enquanto houver mais de um time, o torneio continua
        while (teams.size() > 1) {
            List<String> winners = new ArrayList<>();

            // i pula de 2 em 2 para pegar os pares de cada confronto
            for (int i = 0; i < teams.size(); i += 2) {
                int m = sc.nextInt();
                int n = sc.nextInt();

                if (m > n) {
                    winners.add(teams.get(i));     // Time da esquerda vence
                } else {
                    winners.add(teams.get(i + 1)); // Time da direita vence
                }
            }

            // A lista de times agora passa a ser apenas a dos vencedores da fase anterior
            teams = winners; 
        }

        System.out.println(teams.get(0));
        sc.close();
    }
}

// Minha Versão:

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
// import java.util.Scanner;

// public class CopaDoMundo {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String[] teamsEntry = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P" };
//         List<String> teams = new ArrayList<>(Arrays.asList(teamsEntry));
//         List<String> eliminated = new ArrayList<>();

//         for (int i = 0; i < 16; i += 2) {
//             int m = sc.nextInt();

//             int n = sc.nextInt();

//             if (m > n) {
//                 eliminated.add(teams.get(i + 1));
//             } else {
//                 eliminated.add(teams.get(i));
//             }
//         }

//         teams.removeAll(eliminated);

//         for (int i = 0; i < 8; i += 2) {
//             int m = sc.nextInt();
//             int n = sc.nextInt();

//             if (m > n) {
//                 eliminated.add(teams.get(i + 1));
//             } else {
//                 eliminated.add(teams.get(i));
//             }
//         }

//         teams.removeAll(eliminated);

//         for (int i = 0; i < 4; i += 2) {
//             int m = sc.nextInt();
//             int n = sc.nextInt();

//             if (m > n) {
//                 eliminated.add(teams.get(i + 1));
//             } else {
//                 eliminated.add(teams.get(i));
//             }
//         }

//         teams.removeAll(eliminated);

//         for (int i = 0; i < 2; i += 2) {
//             int m = sc.nextInt();
//             int n = sc.nextInt();

//             if (m > n) {
//                 eliminated.add(teams.get(i + 1));
//             } else {
//                 eliminated.add(teams.get(i));
//             }
//         }

//         teams.removeAll(eliminated);

//         System.out.println(teams.get(0));

//         sc.close();
//     }
// }
