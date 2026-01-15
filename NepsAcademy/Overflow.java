import java.util.Scanner;

public class Overflow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int p = sc.nextInt();
        String c = sc.next();
        int q = sc.nextInt();

        if (c.equalsIgnoreCase("+")) {
            int result = p+q;
            if (result > n) {
                System.out.println("OVERFLOW");
            } else {
                System.out.println("OK");
            }
        } else {
            int result = p*q;
            if (result > n) {
                System.out.println("OVERFLOW");
            } else {
                System.out.println("OK");
            }
        }

        sc.close();
        
    }
}
