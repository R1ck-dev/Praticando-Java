import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TacosDeBilhar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        Set<Integer> estoque = new HashSet<>();
        int sum = 0;


        for (int i = 0; i < c; i++) {
            int currentTaco = sc.nextInt();

            if (estoque.contains(currentTaco)) {
                estoque.remove(currentTaco);
                
            } else {
                estoque.add(currentTaco);
                sum+=2;
            }
        }

        System.out.println(sum);
        sc.close();
    }
}