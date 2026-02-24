import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Dentista {

    static class Consulta {
        int inicio;
        int fim;

        public  Consulta(int inicio, int fim) {
            this.inicio = inicio;
            this.fim = fim;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Consulta[] consultas = new Consulta[n];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            consultas[i] = new Consulta(x, y);
        }

        Arrays.sort(consultas, Comparator.comparingInt(c -> c.fim)); // Ordenando pela variável de classe fim

        int fimUltimaConsulta = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (consultas[i].inicio >= fimUltimaConsulta) {
                count++;
                fimUltimaConsulta = consultas[i].fim;
            }

        }

        System.out.println(count);
        sc.close();
    }
}