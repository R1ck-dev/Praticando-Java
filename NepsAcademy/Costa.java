import java.util.Scanner;

public class Costa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linhas = sc.nextInt();
        int colunas = sc.nextInt();
        sc.nextLine();
        char[][] mapa = new char[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            String linhaEntrada = sc.nextLine();
            for (int j = 0; j < colunas; j++) {
                mapa[i][j] = linhaEntrada.charAt(j);
            }
        }

        int countCosta = 0;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (mapa[i][j] == '#') {
                    if (i == 0 || i == linhas - 1 || j == 0 || j == colunas - 1) {
                        countCosta++;
                    } else if (mapa[i - 1][j] == '.' || mapa[i + 1][j] == '.' ||
                            mapa[i][j - 1] == '.' || mapa[i][j + 1] == '.') {
                        countCosta++;
                    }
                }
            }
        }

        System.out.println(countCosta);

        sc.close();
    }
}