import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Matryoshka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nList = new int[n];
        int[] nListInOrder = new int[n];
        List<Integer> nListOut = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            nList[i] = number;
            nListInOrder[i] = number;
        }

        Arrays.sort(nListInOrder);

        for (int i = 0; i < n; i++) {
            if (nList[i] != nListInOrder[i]) {
                nListOut.add(nList[i]);
            }
        }

        if (nListOut.size() > 0) {
            System.out.println(nListOut.size());
            nListOut.stream()
                    .sorted()
                    .forEach(value -> System.out.print(value + " "));

        } else {
            System.out.println(nListOut.size());
        }

        sc.close();
    }
}
