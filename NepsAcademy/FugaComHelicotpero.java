import java.util.Scanner;

public class FugaComHelicotpero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt(); 
        int p = sc.nextInt(); 
        int f = sc.nextInt(); 
        int d = sc.nextInt(); 

        while (true) {
            f = f + d;

            if (f > 15) {
                f = 0;
            } else if (f < 0) {
                f = 15;
            }

            if (f == h) {
                System.out.println("S");
                break;
            } else if (f == p) {
                System.out.println("N"); 
                break;
            }
        }

        sc.close();
    }
}