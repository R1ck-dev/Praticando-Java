import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FrequenciaNaAula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> vn = new ArrayList<>();
        List<Integer> vUnique = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int registerNumber = sc.nextInt();
            vn.add(registerNumber);
            if (!(vUnique.contains(registerNumber))) {
                vUnique.add(registerNumber);
            }
        }

        System.out.println(vUnique.size());

        sc.close();
    }
}
