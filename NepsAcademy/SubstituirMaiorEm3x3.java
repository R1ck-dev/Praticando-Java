import java.util.Scanner;

public class SubstituirMaiorEm3x3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int entry = sc.nextInt();
                matriz[i][j] = entry;
            }
        }

        int maiorValor = matriz[0][0];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == maiorValor) {
                    matriz[i][j] = -1;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[0][i] + " ");
        }
        System.out.println();
                for (int i = 0; i < 3; i++) {
            System.out.print(matriz[1][i] + " ");
        }
        System.out.println();
                for (int i = 0; i < 3; i++) {
            System.out.print(matriz[2][i] + " ");
        }

        sc.close();
    }
}

// Versão Otimizada:

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[][] matriz = new int[3][3];
        
//         // Inicializamos com um valor muito baixo ou o primeiro da entrada
//         int maiorValor = Integer.MIN_VALUE;

//         // 1. LEITURA E BUSCA DO MAIOR (Tudo junto)
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 matriz[i][j] = sc.nextInt();
                
//                 if (matriz[i][j] > maiorValor) {
//                     maiorValor = matriz[i][j];
//                 }
//             }
//         }

//         // 2. SUBSTITUIÇÃO E IMPRESSÃO
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 // Se for o maior, vira -1
//                 if (matriz[i][j] == maiorValor) {
//                     matriz[i][j] = -1;
//                 }
                
//                 // Já imprimimos o valor (seguido de espaço ou quebra de linha)
//                 System.out.print(matriz[i][j] + (j == 2 ? "" : " "));
//             }
//             System.out.println(); // Pula linha ao fim de cada linha da matriz
//         }

//         sc.close();
//     }
// }