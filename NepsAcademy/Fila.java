import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<String> fila = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String toAdd = sc.next();
            fila.add(toAdd);
        }

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            String toRemove = sc.next();
            fila.remove(toRemove);
        }

        for (String value : fila) {
            System.out.print(value + " ");
        }
        sc.close();
    }
}