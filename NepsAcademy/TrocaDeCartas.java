import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrocaDeCartas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        List<Integer> aList = new ArrayList<>();
        List<Integer> bList = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            aList.add(sc.nextInt());
        }

        for (int i = 0; i < b; i++) {
            bList.add(sc.nextInt());
        }

        int count = 0;

        List<Integer> bigList = new ArrayList<>();
        List<Integer> smallList = new ArrayList<>();

        if (aList.size() > bList.size()) {
            bigList = aList;
            smallList = bList;
        } else {
            bigList = bList;
            smallList = aList;
        }

        for (int i = 0; i < smallList.size(); i++) {
            if (!bigList.contains(smallList.get(i))) {
                count++;
            }
            if (count == 4) {
                break;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
