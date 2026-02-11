import java.util.Scanner;

public class FuncaoFatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int finalValue = 1;

        for (int i = n; i != 1; i--) {
            finalValue *= i;
        }

        System.out.println(finalValue);
        sc.close();
    }
}
