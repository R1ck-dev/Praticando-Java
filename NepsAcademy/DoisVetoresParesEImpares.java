import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoisVetoresParesEImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> pair = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int number = sc.nextInt();
            if ((number % 2) == 0) {
                pair.add(number);
            } else {
                odd.add(number);
            }
        }

        pair.stream()
            .forEach(value -> System.out.print(value + " "));
        System.out.println();
        odd.stream()
            .forEach(value -> System.out.print(value + " "));
        sc.close();
    }
}
