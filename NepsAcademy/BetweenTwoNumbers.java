import java.util.Scanner;

public class BetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int maior = 0;
        int menor = 0;
        
        if (a > b) {
            maior = a;
            menor = b;
        } else {
            maior = b;
            menor = a;
        }

        for (int i = menor; i <= maior; i++) {
            System.out.print(i + " ");
        }
        
        sc.close();
    }
}
