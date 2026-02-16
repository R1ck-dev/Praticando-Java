import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AlbumDaCopa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> figurinhas = new HashSet<>();

        for (int i = 0; i < m; i++) {
            figurinhas.add(sc.nextInt());
        }

        int figurinhasFaltando = n - figurinhas.size();

        System.out.println(figurinhasFaltando);
        sc.close();

    }
}