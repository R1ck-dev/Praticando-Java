import java.util.Scanner;
//TODO
public class TocaDoSaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linhas = sc.nextInt();
        int colunas = sc.nextInt();
        
        int[][] map = new int[linhas][colunas];
        boolean salaEncontrada = false;

        int[] dLinha = {-1, 1, 0, 0};
        int[] dColuna = {0, 0, -1, 1};

        int linhaAtual = 0;
        int colunaAtual = 0;

        int passos = 1;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                int entrada = sc.nextInt();
                if (entrada == 2) {
                    linhaAtual = i;
                    colunaAtual = j;
                }
                map[i][j] = entrada;
            }
        }

        while (!salaEncontrada) {
            map[linhaAtual][colunaAtual] = 0;

            for (int i = 0; i < 4; i++) {
                int novaLinha = linhaAtual + dLinha[i];
                int novaColuna = colunaAtual + dColuna[i];

                if (novaLinha >= 0 && novaLinha < linhas && novaColuna >= 0 && novaColuna < colunas) {

                    int proximoValor = map[novaLinha][novaColuna];

                    if (proximoValor == 1 || proximoValor == 3) {
                        passos++;
                        linhaAtual = novaLinha; 
                        colunaAtual = novaColuna;
                        
                        if (proximoValor == 3) {
                            salaEncontrada = true;
                        }
                        break; 
                    }
                }
            }
        }

        System.out.println(passos);
        sc.close();
    }
}