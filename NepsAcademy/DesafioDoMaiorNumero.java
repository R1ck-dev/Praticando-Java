import java.util.Scanner;

public class DesafioDoMaiorNumero{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int biggestValue = 0;
        int n = sc.nextInt();

        while (n != 0) {
            if (n > biggestValue) {
                biggestValue = n;
            }

            n = sc.nextInt();
        }

        System.out.println(biggestValue);
        sc.close();
    }
}