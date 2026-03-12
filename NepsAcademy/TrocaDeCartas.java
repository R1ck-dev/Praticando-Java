import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TrocaDeCartas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        Set<Integer> setAlice = new HashSet<>();
        Set<Integer> setBeatriz = new HashSet<>();

        for (int i = 0; i < A; i++) {
            setAlice.add(sc.nextInt());
        }
        for (int i = 0; i < B; i++) {
            setBeatriz.add(sc.nextInt());
        }

        int ganhoAlice = 0;
        int ganhoBeatriz = 0;

        for (Integer carta : setAlice) {
            if (!setBeatriz.contains(carta)) {
                ganhoAlice++;
            }
        }

        for (Integer carta : setBeatriz) {
            if (!setAlice.contains(carta)) {
                ganhoBeatriz++;
            }
        }

        System.out.println(Math.min(ganhoAlice, ganhoBeatriz));

        sc.close();
    }
}