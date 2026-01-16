import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        boolean isPrimeNumber = true;

        if (x == 1) {
            isPrimeNumber = false;
        } else {
            for (int i = 2; i < x; i++) {
                if (x%i==0) {
                    isPrimeNumber = false;
                    break;
                }
            }
        }

        if (isPrimeNumber) {
            System.out.println('S');
        } else {
            System.out.println('N');
        }

        sc.close();
    }
}
