import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuscaSimplesNoVetor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valuesList = new int[10];

        for (int i = 0; i < 10; i++) {
            valuesList[i] = sc.nextInt();
        }

        int valueToSearch = sc.nextInt();
        List<Integer> indexList = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < 10; i++) {
            if (valuesList[i] == valueToSearch) {
                count++;
                indexList.add(i);
            }
        }

        if (count == 0) {
            System.out.println("Mia x");
        } else {
            System.out.println(count);
            for (Integer index : indexList) {
                System.out.print(index + " ");
            }
        }

        sc.close();
    }
}
