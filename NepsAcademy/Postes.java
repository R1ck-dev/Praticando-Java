import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Postes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> postes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            postes.add(sc.nextInt());
        }

        int countSub = 0;
        int countConse = 0;
        for (int i = 0; i < postes.size(); i++) {
            if (postes.get(i) < 50) {
                countSub++;
            } else if (postes.get(i) >= 50 && postes.get(i) < 85) {
                countConse++;
            }
        }

        System.out.println(countSub + " " + countConse);
        sc.close();
    }
}
